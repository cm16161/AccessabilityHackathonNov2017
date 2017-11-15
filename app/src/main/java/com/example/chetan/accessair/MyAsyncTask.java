package com.example.chetan.accessair;

import android.content.Context;
import android.util.Log;

/**
 * Created by chetan on 14/11/17.
 */

public class MyAsyncTask {
    private Context context;
    public String overall;

    public MyAsyncTask() {  // can take other params if needed
//        this.context = context;
    }
//    public static String getOverall(){
//        return overall;
//    }

    protected void doInBackground(String postcode) {
//        String email = emailText.getText().toString();
        // Do some validation here

        try {
            URLConnectionReader url = new URLConnectionReader();
            overall = url.main(postcode);
//            overall = url.getOverall();

//            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
//            try {
//                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
//                StringBuilder stringBuilder = new StringBuilder();
//                String line;
//                while ((line = bufferedReader.readLine()) != null) {
//                    stringBuilder.append(line).append("\n");
//                }
//                bufferedReader.close();
//                return stringBuilder.toString();
//            }
//            finally{
//                urlConnection.disconnect();
//            }
        }
        catch(Exception e) {
            Log.e("ERROR", e.getMessage(), e);
//            return null;
        }
    }

//    protected static String getOverall(){
//        return overall;
//    }
// Add your AsyncTask methods and logic
//you can use your context variable in onPostExecute() to manipulate activity UI
}
