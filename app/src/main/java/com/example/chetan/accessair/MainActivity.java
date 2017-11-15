package com.example.chetan.accessair;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends Activity {
//    Button button;
//    Integer hello;
//    TextView text;
    private MyAsyncTask myTask = new MyAsyncTask();
//    myTask.execute();
    private Exception exception;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.button);
//        text =findViewById(R.id.text);
//        hello = 5;
        final EditText getPostcode = findViewById(R.id.getPostcode);
        getPostcode.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                getPostcode.setText("");
            }
        });

        final TextView textView =  findViewById(R.id.textView);
        final TextView output = findViewById(R.id.output);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                text =findViewById(R.id.text);
                myTask = new MyAsyncTask();
                String postcode = getPostcode.getText().toString();
                postcode = postcode.toUpperCase();
                myTask.doInBackground(postcode);
                myTask.doInBackground(postcode);
//                myTask.overall;
                textView.setText("The Pollution in "+postcode+" is: ");
                output.setText(myTask.overall);
                getPostcode.setText("");
//                System.out.println("Hello, World!");
//                System.out.println(myTask.overall);
            }
        });
    }




//    protected String doInBackground(Void... urls) {
////        String email = emailText.getText().toString();
//        // Do some validation here
//
//        try {
//            URLConnectionReader url = new URLConnectionReader();
//            url.main();
////            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
////            try {
////                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
////                StringBuilder stringBuilder = new StringBuilder();
////                String line;
////                while ((line = bufferedReader.readLine()) != null) {
////                    stringBuilder.append(line).append("\n");
////                }
////                bufferedReader.close();
////                return stringBuilder.toString();
////            }
////            finally{
////                urlConnection.disconnect();
////            }
//        }
//        catch(Exception e) {
//            Log.e("ERROR", e.getMessage(), e);
//            return null;
//        }
//    }

//    package com.example.chetan.accessair;

//import android.content.Context;
//import android.util.Log;
//
//    /**
//     * Created by chetan on 14/11/17.
//     */
//
//    public class MyAsyncTask {
//        private Context context;
//        public String overall;
//
//        public MyAsyncTask() {  // can take other params if needed
//            this.context = context;
//        }
////    public static String getOverall(){
////        return overall;
////    }
//
//        protected void doInBackground(String postcode) {
////        String email = emailText.getText().toString();
//            // Do some validation here
//
//            try {
//                URLConnectionReader url = new URLConnectionReader();
//                System.out.println("TESTESTSETSETSETSETS");
//                overall = url.main(postcode);
//                System.out.println("TESTESTSETSETSETSETS");
////            System.out.println(url.main(postcode));
////            overall = url.getOverall();
//
////            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
////            try {
////                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
////                StringBuilder stringBuilder = new StringBuilder();
////                String line;
////                while ((line = bufferedReader.readLine()) != null) {
////                    stringBuilder.append(line).append("\n");
////                }
////                bufferedReader.close();
////                return stringBuilder.toString();
////            }
////            finally{
////                urlConnection.disconnect();
////            }
//            }
//            catch(Exception e) {
//                Log.e("ERROR", e.getMessage(), e);
////            return null;
//            }
//        }
//
////    protected static String getOverall(){
////        return overall;
////    }
//// Add your AsyncTask methods and logic
////you can use your context variable in onPostExecute() to manipulate activity UI
//    }
}
