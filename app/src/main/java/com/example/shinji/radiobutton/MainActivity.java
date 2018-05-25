package com.example.shinji.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// 通常ラジオボタン
		NormalRadio();
		// タブ風ラジオボタン
		TabRadio();
		// 画像ラジオボタン
		ImageRadio();
	}

	void NormalRadio(){
		RadioGroup radioGroup = (RadioGroup) findViewById(R.id.RadioGroupA);
		RadioButton radioButton1 = (RadioButton) findViewById(R.id.RadioButtonA1);
		RadioButton radioButton2 = (RadioButton) findViewById(R.id.RadioButtonA2);
		RadioButton radioButton3 = (RadioButton) findViewById(R.id.RadioButtonA3);

		// ラジオグループのチェック状態が変更された時に呼び出されるコールバックリスナーを登録します
		// setCheckedの前に宣言していればsetCheckedのときも呼ばれる
		radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
			// ラジオグループのチェック状態が変更された時に呼び出されます
			// チェック状態が変更されたラジオボタンのIDが渡されます
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				RadioButton radioButton = (RadioButton) findViewById(checkedId);
				Toast.makeText(MainActivity.this,"onCheckedChanged():" + radioButton.getText(),Toast.LENGTH_SHORT).show();
				Log.w( "DEBUG_DATA", "onCheckedChanged radioButton[" + radioButton.getText() + "]" );
			}
		});

		// 指定した ID のラジオボタンをチェックします
		radioButton3.setChecked(true);

		// チェックされているラジオボタンの ID を取得します
		RadioButton radioButton = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
		Log.w( "DEBUG_DATA", "radioButton[" + radioButton.getText() + "]" );
	}

	void TabRadio(){
		RadioGroup radioGroup = (RadioGroup) findViewById(R.id.RadioGroupB);
		RadioButton radioButton1 = (RadioButton) findViewById(R.id.RadioButtonB1);
		RadioButton radioButton2 = (RadioButton) findViewById(R.id.RadioButtonB2);

		// ラジオグループのチェック状態が変更された時に呼び出されるコールバックリスナーを登録します
		// setCheckedの前に宣言していればsetCheckedのときも呼ばれる
		radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
			// ラジオグループのチェック状態が変更された時に呼び出されます
			// チェック状態が変更されたラジオボタンのIDが渡されます
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				RadioButton radioButton = (RadioButton) findViewById(checkedId);
				Toast.makeText(MainActivity.this,"onCheckedChanged():" + radioButton.getText(),Toast.LENGTH_SHORT).show();
				Log.w( "DEBUG_DATA", "onCheckedChanged radioButton[" + radioButton.getText() + "]" );
			}
		});

		// 指定した ID のラジオボタンをチェックします
		radioButton2.setChecked(true);

		// チェックされているラジオボタンの ID を取得します
		RadioButton radioButton = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
		Log.w( "DEBUG_DATA", "radioButton[" + radioButton.getText() + "]" );

	}

	void ImageRadio(){
		RadioGroup radioGroup = (RadioGroup) findViewById(R.id.RadioGroupC);
		RadioButton radioButton1 = (RadioButton) findViewById(R.id.RadioButtonC1);
		RadioButton radioButton2 = (RadioButton) findViewById(R.id.RadioButtonC2);

		// ラジオグループのチェック状態が変更された時に呼び出されるコールバックリスナーを登録します
		// setCheckedの前に宣言していればsetCheckedのときも呼ばれる
		radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
			// ラジオグループのチェック状態が変更された時に呼び出されます
			// チェック状態が変更されたラジオボタンのIDが渡されます
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				RadioButton radioButton = (RadioButton) findViewById(checkedId);
				Toast.makeText(MainActivity.this,"onCheckedChanged():" + radioButton.getText(),Toast.LENGTH_SHORT).show();
				Log.w( "DEBUG_DATA", "onCheckedChanged radioButton[" + radioButton.getText() + "]" );
			}
		});

		// 指定した ID のラジオボタンをチェックします
		radioButton2.setChecked(true);

		// チェックされているラジオボタンの ID を取得します
		RadioButton radioButton = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
		Log.w( "DEBUG_DATA", "radioButton[" + radioButton.getText() + "]" );

	}
}
