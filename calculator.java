package com.example.sample2;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.regex.Pattern;
public class MainActivity extends AppCompatActivity implements
View.OnClickListener {
 Button btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix;
 Button btnSeven, btnEight, btnNine, btnZero; Button
btnAdd,btnSub,btnMul,btnDiv;
 Button btnClear,btnEqual,btnDot;
 EditText txtResult;
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 btnOne=(Button)findViewById(R.id.button_one);
 btnOne.setOnClickListener(this);
 btnTwo=(Button)findViewById(R.id.button_two);
 btnTwo.setOnClickListener(this);
 btnThree=(Button)findViewById(R.id.button_three);
 btnThree.setOnClickListener(this);
 btnFour=(Button)findViewById(R.id.button_four);
 btnFour.setOnClickListener(this);
 btnFive=(Button)findViewById(R.id.button_five);
 btnFive.setOnClickListener(this);
 btnSix=(Button)findViewById(R.id.button_six);
 btnSix.setOnClickListener(this);
 btnSeven=(Button)findViewById(R.id.button_seven);
 btnSeven.setOnClickListener(this);
 btnEight=(Button)findViewById(R.id.button_eight);
 btnEight.setOnClickListener(this);
 btnNine=(Button)findViewById(R.id.button_nine);
 btnNine.setOnClickListener(this);
 btnZero=(Button)findViewById(R.id.button_zero);
 btnZero.setOnClickListener(this);
 btnAdd=(Button)findViewById(R.id.button_add);
 btnAdd.setOnClickListener(this);
 btnSub=(Button)findViewById(R.id.button_sub);
 btnSub.setOnClickListener(this);
 btnMul=(Button)findViewById(R.id.button_mul);
 btnMul.setOnClickListener(this);
 btnDiv=(Button)findViewById(R.id.button_div);
 btnDiv.setOnClickListener(this);
 btnClear=(Button)findViewById(R.id.button_clear);
 btnClear.setOnClickListener(this);
 btnEqual=(Button)findViewById(R.id.button_equal);
 btnEqual.setOnClickListener(this);
 btnDot=(Button)findViewById(R.id.button_dot);
 btnDot.setOnClickListener(this);
 txtResult=(EditText)findViewById(R.id.txt_result);
 txtResult.setText("");
 }
 @Override
 public void onClick(View v) {
 if(v.equals(btnOne))
 txtResult.append("1");
 if(v.equals(btnTwo))
 txtResult.append("2");
 if(v.equals(btnThree))
 txtResult.append("3");
 if(v.equals(btnFour))
 txtResult.append("4");
 if(v.equals(btnFive))
 txtResult.append("5");
 if(v.equals(btnSix))
 txtResult.append("6");
 if(v.equals(btnSeven))
 txtResult.append("7");
 if(v.equals(btnEight))
 txtResult.append("8");
 if(v.equals(btnNine))
 txtResult.append("9");
 if(v.equals(btnZero))
 txtResult.append("0");
 if(v.equals(btnDot))
 txtResult.append(".");
 if(v.equals(btnClear))
 txtResult.setText("");
 if(v.equals(btnAdd))
 txtResult.append("+");
 if(v.equals(btnSub))
 txtResult.append("-");
 if(v.equals(btnMul))
 txtResult.append("*");
 if(v.equals(btnDiv))
 txtResult.append("/");
 if(v.equals(btnEqual))
 {
 try {
 String data = txtResult.getText().toString();
 if (data.contains("/")) {
 String[] operands = data.split("/");
 if(operands.length==2) {
 double operand1 = Double.parseDouble(operands[0]);
 double operand2 = Double.parseDouble(operands[1]);
 double result = operand1 / operand2;
txtResult.setText(String.valueOf(result));
 }
else
{
 Toast.makeText(getBaseContext(),"Invalid Input",
Toast.LENGTH_LONG).show();
 }
 }
 else if (data.contains("*")) {
 String[] operands = data.split(Pattern.quote("*"));
 if(operands.length==2) {
 double operand1 = Double.parseDouble(operands[0]);
 double operand2 = Double.parseDouble(operands[1]);
 double result = operand1 * operand2;
txtResult.setText(String.valueOf(result));
 }
else
{
 Toast.makeText(getBaseContext(),"Invalid Input",
Toast.LENGTH_LONG).show();
 }
 }
 else if (data.contains("+")) {
 String[] operands = data.split(Pattern.quote("+"));
 if(operands.length==2) {
 double operand1 = Double.parseDouble(operands[0]);
 double operand2 = Double.parseDouble(operands[1]);
 double result = operand1 + operand2;
txtResult.setText(String.valueOf(result));
 }
else
{
 Toast.makeText(getBaseContext(),"Invalid Input",
Toast.LENGTH_LONG).show();
 }
 }
 else if (data.contains("-")) {
 String[] operands = data.split("-");
 if(operands.length==2) {
 double operand1 = Double.parseDouble(operands[0]);
 double operand2 = Double.parseDouble(operands[1]);
 double result = operand1 - operand2;
 txtResult.setText(String.valueOf(result));
 }
 else
 {
 Toast.makeText(getBaseContext(),"Invalid Input",
Toast.LENGTH_LONG).show();
 }
 }
 }
 catch(Exception e) {
 Toast.makeText(getBaseContext(),"Invalid Input",
Toast.LENGTH_LONG).show();
 }
 }
 }
}
Program 4
.java
package com.example.program4;
import androidx.appcompat.app.AppCompatActivity;
import android.app.WallpaperManager;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.Timer;
import java.util.TimerTask;
public class MainActivity extends AppCompatActivity implements
View.OnClickListener {
 Button btnChangeWallpaper;
 boolean running;
 int[] imagesArray = new int[]{
 R.drawable.download1, R.drawable.download2, R.drawable.download3,
R.drawable.download4,R.drawable.download5,R.drawable.download6,R.drawable.dow
nload7,R.drawable.download8,R.drawable.download9,R.drawable.download10
 };
 int i = 0;
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 btnChangeWallpaper = (Button)
findViewById(R.id.btn_start_change_wallpaper);
 btnChangeWallpaper.setOnClickListener(this);
 }
 @Override
 public void onClick(View v) {
 if(!running)
 {
 new Timer().schedule (new MyTimer(),0,6000); running=true;
 }
 }
 class MyTimer extends TimerTask
 {
 public void run() {
 try {
 WallpaperManager wallpaperManager =
WallpaperManager.getInstance(getBaseContext());
 if (i == 12) i = 1;
 if (i == 11) i = 2;
 if (i == 10) i = 3;
 if (i == 9) i = 4;
 if (i == 8) i = 5;
 if (i == 7) i = 6;
 if (i == 6) i = 7;
 if (i == 5) i = 8;
 if (i == 4) i = 9;
 if (i == 3) i = 10;

wallpaperManager.setBitmap(BitmapFactory.decodeResource(getResources()
 , imagesArray[i]));
 i++;
 }
 catch (Exception e)
 {
 }
 }
 }
 }
.manifest
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
 package="com.example.program4">
 <uses-permission android:name="android.permission.SET_WALLPAPER"/>
 <application
 android:allowBackup="true"
 android:icon="@mipmap/ic_launcher"
 android:label="@string/app_name"
 android:roundIcon="@mipmap/ic_launcher_round"
 android:supportsRtl="true"
 android:theme="@style/Theme.Program4">
 <activity
 android:name=".MainActivity"
 android:exported="true">
 <intent-filter>
 <action android:name="android.intent.action.MAIN" />
 <category android:name="android.intent.category.LAUNCHER" />
 </intent-filter>
 </activity>
 </application>
</manifest>
.xml
?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout
xmlns:android="http://schemas.android.com/apk/res/android"
 xmlns:app="http://schemas.android.com/apk/res-auto"
 xmlns:tools="http://schemas.android.com/tools"
 android:layout_width="match_parent"
 android:layout_height="match_parent"
 tools:context=".MainActivity">
 <Button
 android:id="@+id/btn_start_change_wallpaper"
 android:layout_width="wrap_content"
 android:layout_height="wrap_content"
 android:text="change wallpaper"
 android:textAllCaps="true"
 android:textSize="34sp"
 app:layout_constraintBottom_toBottomOf="parent"
 app:layout_constraintEnd_toEndOf="parent"
 app:layout_constraintHorizontal_bias="0.5"
 app:layout_constraintStart_toStartOf="parent"
 app:layout_constraintTop_toTopOf="parent" />
</androidx.constraintlayout.widget.ConstraintLayout>
