package com.example.eiko.cookies;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * Created by eiko on 11/2/2016.
 */
public class JustJava extends Activity {
    int numberofcoffee = 0;
    TextView quantity;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.justjava);
        quantity = (TextView)findViewById(R.id.quantity_textview);
    }
    public void increase(View v){
         numberofcoffee = numberofcoffee + 1;
        display(numberofcoffee);
    }
    public void decrease(View v){
        numberofcoffee -= 1;
        display(numberofcoffee);

    }
    public void submitOrder(View v){
        display(numberofcoffee);
        //displayPrie( numberofcoffee*3);
        int price =numberofcoffee*3;
        String message = "Total is $"+ price;
        message += "\n thank you";
        displayMessage(message);

    }
    private void display(int number){

        quantity.setText(" "+number);
    }
    private void displayPrie(int number){
        TextView priceText = (TextView)findViewById(R.id.price_text);
        priceText.setText("Total :"+NumberFormat.getCurrencyInstance().format(number));
    }
    public void displayMessage(String message){
        TextView pricetextt = (TextView)findViewById(R.id.price_text);
        pricetextt.setText(message);
    }
}
