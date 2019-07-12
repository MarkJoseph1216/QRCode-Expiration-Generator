package com.example.qrcodegeneratorexpiration;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TimePicker;
import android.widget.Toast;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity
        implements DatePickerDialog.OnDateSetListener, TimePickerDialog.OnTimeSetListener {

    ImageButton btnGenerateQRCode,btnExit, buttonExit;
    ImageView imgGenerateQR;
    Button btnSave, btnConfirm, btnCancel, btnExitMain;
    TextInputEditText edtDate;
    int size = 660;
    String txtResult = "";
    String text = "";
    String time;
    Bitmap myBitmap;
    Dialog showQRImage, showInputPassword, dialogFinished;
    Dialog dialogExit;
    View view;
    TextInputEditText edtPassword;

    int monthFinal, dayFinal,yearFinal, hourFinal, minuteFinal, hour, minute;
    String formatMonth, formatDay, formatHour,formatMinute;
    String dateToday;

    ImageView imgFinished;
    Button btnOkay;
    TextInputEditText edtCodeEncrypt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        btnGenerateQRCode = (ImageButton) findViewById(R.id.btnGenerateQRCode);
        buttonExit = (ImageButton) findViewById(R.id.buttonExit);

        view = findViewById(R.id.relativeLayout);

        dateToday = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault()).format(new Date());
        showQRImage = new Dialog(MainActivity.this);
        showInputPassword = new Dialog(MainActivity.this);
        dialogExit = new Dialog(MainActivity.this);
        dialogFinished = new Dialog(MainActivity.this);

        //Checking a Permission for the Storage
        String[] PERMISSIONS = {
                "android.permission.READ_EXTERNAL_STORAGE",
                "android.permission.WRITE_EXTERNAL_STORAGE" };
        int permission = ContextCompat.checkSelfPermission(this,
                "android.permission.WRITE_EXTERNAL_STORAGE");
        if (permission != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, PERMISSIONS,1);
        }

        btnGenerateQRCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showInputPassword();
            }
        });
    }

    //Showing QR Generated Form
    private void showInputPassword() {
        showInputPassword.setContentView(R.layout.password_generate);
        btnConfirm = (Button) showInputPassword.findViewById(R.id.btnConfirm);
        edtPassword = (TextInputEditText) showInputPassword.findViewById(R.id.edtPassword);

        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String password = edtPassword.getText().toString();

                if(password.equals("1234")){
                    showInputPassword.dismiss();
                    showQRImage();
                } else {
                    edtPassword.onEditorAction(EditorInfo.IME_ACTION_DONE);
                    Snackbar.make(view, "Invalid Password", Snackbar.LENGTH_SHORT).show();
                }
            }
        });

        buttonExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialogExit();
            }
        });

        showInputPassword.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        showInputPassword.setCanceledOnTouchOutside(false);
        showInputPassword.show();
    }

    //Showing QR Generated Form
    private void showQRImage(){

        showQRImage.setContentView(R.layout.generate_code);

        imgGenerateQR = (ImageView) showQRImage.findViewById(R.id.imgGenerateQR);
        btnSave = (Button) showQRImage.findViewById(R.id.btnSave);
        btnExit = (ImageButton) showQRImage.findViewById(R.id.btnExit);
        edtDate = (TextInputEditText) showQRImage.findViewById(R.id.edtDate);

        //Saving QR Code
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String date = edtDate.getText().toString();

                if (date.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please Select a Validation Date first!", Toast.LENGTH_SHORT).show();
                } else {

                    saveBitmap(myBitmap, date, dateToday, ".jpg");
                    Snackbar.make(view, "Successfully Saved!", Snackbar.LENGTH_SHORT).show();
                    showQRImage.dismiss();

                    showImageFinished();
                }
            }
        });

        //Exit Button
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showQRImage.dismiss();
            }
        });

        //Setting a Validation Date
        edtDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Calendar c =  Calendar.getInstance();

                int year = c.get(Calendar.YEAR);
                int month = c.get(Calendar.MONTH);
                int day = c.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog datePickerDialog = new DatePickerDialog(MainActivity.this, R.style.DialogTheme, MainActivity.this , year, month, day);
                datePickerDialog.getDatePicker().setMinDate(System.currentTimeMillis());
                datePickerDialog.show();
            }
        });
        showQRImage.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        showQRImage.setCanceledOnTouchOutside(false);
        showQRImage.show();
    }

    private void showDialogExit() {
        dialogExit.setContentView(R.layout.logout_message);
        btnCancel = (Button) dialogExit.findViewById(R.id.btnCancel);
        btnExitMain = (Button) dialogExit.findViewById(R.id.btnExit);

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogExit.dismiss();
            }
        });

        btnExitMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogExit.dismiss();
                finish();
            }
        });

        dialogExit.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialogExit.setCanceledOnTouchOutside(false);
        dialogExit.show();
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        yearFinal = year;
        monthFinal = month + 1;
        dayFinal = dayOfMonth;

        //Checking if the number is below 10
        if(monthFinal < 10){
            formatMonth = "0" + monthFinal;
        } else {
            formatMonth = String.valueOf(monthFinal);
        }
        if(dayFinal < 10) {
            formatDay = "0" + dayFinal;
        } else {
            formatDay = String.valueOf(dayFinal);
        }

        Calendar c = Calendar.getInstance();
        hour = c.get(Calendar.HOUR_OF_DAY);
        minute = c.get(Calendar.MINUTE);

        TimePickerDialog timePickerDialog = new TimePickerDialog(MainActivity.this,R.style.DialogTheme, MainActivity.this,
                hour, minute, DateFormat.is24HourFormat(this));
        timePickerDialog.show();
    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        hourFinal = hourOfDay;
        minuteFinal = minute;

        //Checking if the number is below 10
        if(hourFinal < 10){
            formatHour = "0" + hourFinal;
            Toast.makeText(this, formatHour, Toast.LENGTH_SHORT).show();
        }
        else {
            formatHour = String.valueOf(hourFinal);
        }
        if(minuteFinal < 10){
            formatMinute = "0" + minuteFinal;
        } else {
            formatMinute = String.valueOf(minuteFinal);
        }
        if(hourFinal == Integer.parseInt("12")){
            Toast.makeText(this, String.valueOf(hourFinal), Toast.LENGTH_SHORT).show();
            formatHour = "12";
        }

        text = yearFinal + "-" + formatMonth + "-" + formatDay + " " + formatHour + ":" + formatMinute;
        edtDate.setText(yearFinal + "-" + formatMonth + "-" + formatDay + " " + formatHour + ":" + formatMinute);

        Bitmap bitmap = null;
        try {
            bitmap = CreateImage(text);
            myBitmap = bitmap;
        } catch (WriterException we) {
            we.printStackTrace();
        }
        if (bitmap != null) {
            imgGenerateQR.setImageBitmap(bitmap);
        }
    }

    //Creating QR Code Image
    public Bitmap CreateImage(String message) throws WriterException
    {
        BitMatrix bitMatrix = null;
        String textQR = "QR Code";

        if(textQR.equals("QR Code")){
            bitMatrix = new MultiFormatWriter().encode(message, BarcodeFormat.QR_CODE, size, size);
        }
        int width = bitMatrix.getWidth();
        int height = bitMatrix.getHeight();
        int [] pixels = new int [width * height];
        for (int i = 0 ; i < height ; i++)
        {
            for (int j = 0 ; j < width ; j++)
            {
                if (bitMatrix.get(j, i))
                {
                    pixels[i * width + j] = 0xff000000;
                }
                else
                {
                    pixels[i * width + j] = 0xffffffff;
                }
            }
        }
        Bitmap bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        bitmap.setPixels(pixels, 0, width, 0, 0, width, height);
        return bitmap;
    }

    //Saving QR Code Image in Local Storage
    public void saveBitmap (Bitmap bitmap, String message, String dateToday, String bitName)
    {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        int millisecond = calendar.get(Calendar.MILLISECOND);

        String fileName = message + "" + String.valueOf(year) + " " + String.valueOf(month) + " " + String.valueOf(day) + " " + String.valueOf(hour) + " " + String.valueOf(minute);
        time = String.valueOf(year) + " " + String.valueOf(month) + " " + String.valueOf(day) + " " + String.valueOf(hour) + " " + String.valueOf(minute);
        File file;

        String fileLocation;
        String folderLocation;

        if(Build.BRAND.equals("Xiaomi") ){
            fileLocation = Environment.getExternalStorageDirectory().getPath()+"/DCIM/Camera/AndroidBarcodeGenerator/" + message + bitName;
            folderLocation = Environment.getExternalStorageDirectory().getPath()+"/DCIM/Camera/AndroidBarcodeGenerator/";
        }else{
            fileLocation = Environment.getExternalStorageDirectory().getPath()+"/DCIM/AndroidBarcodeGenerator/" + message + bitName;
            folderLocation = Environment.getExternalStorageDirectory().getPath()+"/DCIM/AndroidBarcodeGenerator/";
        }

        Log.d("file_location", fileLocation);

        file = new File(fileLocation);
        File folder = new File(folderLocation);
        if (!folder.exists())
        {
            folder.mkdirs();
        }
        if (file.exists())
        {
            file.delete();
        }
        FileOutputStream out;
        try
        {
            out = new FileOutputStream(file);
            if (bitmap.compress(Bitmap.CompressFormat.JPEG, 90, out))
            {
                out.flush();
                out.close();
            }
        }
        catch (FileNotFoundException fnfe)
        {
            fnfe.printStackTrace();
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
        this.sendBroadcast(new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE, Uri.parse("file://" + message + " " + dateToday)));
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if (keyCode == KeyEvent.KEYCODE_BACK) {
            showDialogExit();
        }
        return false;
    }

    private void showImageFinished(){
        dialogFinished.setContentView(R.layout.finished_generate);
        imgFinished = (ImageView) dialogFinished.findViewById(R.id.imgFinished);
        btnOkay = (Button) dialogFinished.findViewById(R.id.btnOkay);
        edtCodeEncrypt = (TextInputEditText) dialogFinished.findViewById(R.id.edtCodeEncrypt);

        String dateCreated = edtDate.getText().toString();

        edtCodeEncrypt.setText(dateCreated);

        Bitmap bitmap = null;
        try {
            bitmap = CreateImage(text);
            myBitmap = bitmap;
        } catch (WriterException we) {
            we.printStackTrace();
        }
        if (bitmap != null) {
            imgFinished.setImageBitmap(bitmap);
        }

        btnOkay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogFinished.dismiss();
            }
        });

        dialogFinished.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialogFinished.setCanceledOnTouchOutside(false);
        dialogFinished.show();
    }
}
