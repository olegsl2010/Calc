package ua.dp.parovoziki.calc;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {
    TextView result;
    int oper1, oper2,res;
    String res1,funct;

    Button but0, but1 , but2 ,but3 ,but4 , but5, but6, but7,but8, but9;
    Button butCE, butPlusMinus,butDel,butPlus,butMinus,butMult,butIs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result= (TextView) findViewById(R.id.textView);

        but0=(Button) findViewById(R.id.but0);
        but1=(Button) findViewById(R.id.but1);
        but2=(Button) findViewById(R.id.but2);
        but3=(Button) findViewById(R.id.but3);
        but4=(Button) findViewById(R.id.but4);
        but5=(Button) findViewById(R.id.but5);
        but6=(Button) findViewById(R.id.but6);
        but7=(Button) findViewById(R.id.but7);
        but8=(Button) findViewById(R.id.but8);
        but9=(Button) findViewById(R.id.but9);
        butCE=(Button) findViewById(R.id.butCE);
        butPlusMinus=(Button) findViewById(R.id.butPlusMinus);
        butDel=(Button) findViewById(R.id.butDel);
        butMult=(Button) findViewById(R.id.butMult);
        butPlus=(Button) findViewById(R.id.butPlus);
        butMinus=(Button) findViewById(R.id.butMinus);
        butIs= (Button) findViewById(R.id.butIs);


        but0.setOnClickListener(this);
        but1.setOnClickListener(this);
        but2.setOnClickListener(this);
        but3.setOnClickListener(this);
        but4.setOnClickListener(this);
        but5.setOnClickListener(this);
        but6.setOnClickListener(this);
        but7.setOnClickListener(this);
        but8.setOnClickListener(this);
        but9.setOnClickListener(this);
        butCE.setOnClickListener(this);
        butPlusMinus.setOnClickListener(this);
        butDel.setOnClickListener(this);
        butMult.setOnClickListener(this);
        butPlus.setOnClickListener(this);
        butMinus.setOnClickListener(this);
        butIs.setOnClickListener(this);
        return;
    }

    public void onClick(View v) {

        textResult(v);
        chagePlusMinus(v);
        cancelOperation(v);
        getFirstValue(v);
        getSecondValue(v);


    }

    private void getSecondValue(View v) {
        res=0;
        if (v.getId()==R.id.butIs){
            oper2= Integer.valueOf((String) result.getText());
            if (funct=="/"){
                res=oper1/oper2;
                result.setText(String.valueOf(res));
            }
            if (funct=="*"){
                res=oper1*oper2;
                result.setText(String.valueOf(res));
            }
            if (funct=="+"){
                res=oper1+oper2;
                result.setText(String.valueOf(res));
            }
            if (funct=="-"){
                res=oper1-oper2;
                result.setText(String.valueOf(res));
            }

        }
    }

    private void getFirstValue(View v) {
//        funct=null;
        if (v.getId()==R.id.butDel)
        {
            oper1= Integer.valueOf((String) result.getText());
            funct="/";
            result.setText("0");
        }
        if (v.getId()==R.id.butMult)
        {
            oper1= Integer.valueOf((String) result.getText());
            funct="*";
            result.setText("0");

        }
        if (v.getId()==R.id.butPlus)
        {
            oper1= Integer.valueOf((String) result.getText());
            funct="+";
            result.setText("0");
        }
        if (v.getId()==R.id.butMinus)
        {
            oper1= Integer.valueOf((String) result.getText());
            funct="-";
            result.setText("0");
        }
    }

    private void chagePlusMinus(View v) {
        res1=null;
        String minus ="-";
        if (v.getId()==R.id.butPlusMinus) {
            res1 = String.valueOf(result.getText());
            if (res1.contains("-")) {
                String res2="";
                res2=res1.substring(1);
                result.setText(res2);
            }
            else{
                res1 = minus + res1;
                result.setText(res1);
            }
        }
    }

    private void cancelOperation(View v) {
        if (v.getId()==R.id.butCE)
        {
            result.setText("0");
        }
    }

    private void textResult(View v) {
        res1=null;
        int buttonIndex = translateIdToIndex(v.getId());
        if (buttonIndex == 0) {
            res1 = String.valueOf(result.getText());
            if (res1.startsWith("0")) {
                result.setText("0");
            }
            else {
                res1 = res1 + "0";
                result.setText(res1);
            }
        }
        if (buttonIndex == 1) {
            res1 = String.valueOf(result.getText());
            if (res1.startsWith("0")) {
                result.setText("1");
            } else {
                res1 = res1 + "1";
                result.setText(res1);
            }
        }
        if (buttonIndex == 2) {
            res1 = String.valueOf(result.getText());
            if (res1.startsWith("0")) {
                result.setText("2");
            } else {
                res1 = res1 + "2";
                result.setText(res1);
            }
        }
        if (buttonIndex == 3) {
            res1 = String.valueOf(result.getText());
            if (res1.startsWith("0")) {
                result.setText("3");
            } else {
                res1 = res1 + "3";
                result.setText(res1);
            }
        }
        if (buttonIndex == 4) {
            res1 = String.valueOf(result.getText());
            if (res1.startsWith("0")) {
                result.setText("4");
            } else {
                res1 = res1 + "4";
                result.setText(res1);
            }
        }
        if (buttonIndex == 5) {
            res1 = String.valueOf(result.getText());
            if (res1.startsWith("0")) {
                result.setText("5");
            } else {
                res1 = res1 + "5";
                result.setText(res1);
            }
        }
        if (buttonIndex == 6) {
            res1 = String.valueOf(result.getText());
            if (res1.startsWith("0")) {
                result.setText("6");
            } else {
                res1 = res1 + "6";
                result.setText(res1);
            }
        }
        if (buttonIndex == 7) {
            res1 = String.valueOf(result.getText());
            if (res1.startsWith("0")) {
                result.setText("7");
            } else {
                res1 = res1 + "7";
                result.setText(res1);
            }
        }
        if (buttonIndex == 8) {
            res1 = String.valueOf(result.getText());
            if (res1.startsWith("0")) {
                result.setText("8");
            } else {
                res1 = res1 + "8";
                result.setText(res1);
            }
        }
        if (buttonIndex == 9) {
            res1 = String.valueOf(result.getText());
            if (res1.startsWith("0")) {
                result.setText("9");
            } else {
                res1 = res1 + "9";
                result.setText(res1);
            }
        }
    }

    int translateIdToIndex(int id) {
        int index = -1;
        switch (id) {
            case R.id.but0:
                index = 0;
                break;
            case R.id.but1:
                index = 1;
                break;
            case R.id.but2:
                index = 2;
                break;
            case R.id.but3:
                index = 3;
                break;
            case R.id.but4:
                index = 4;
                break;
            case R.id.but5:
                index = 5;
                break;
            case R.id.but6:
                index = 6;
                break;
            case R.id.but7:
                index = 7;
                break;
            case R.id.but8:
                index = 8;
                break;
            case R.id.but9:
                index = 9;
                break;
        }
        return index;
    }


}
