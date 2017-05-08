package com.example.root.mm_mentorship_alpha;

import android.os.AsyncTask;

import java.io.IOException;

public class HttpSendPost extends AsyncTask<String, Integer, String> {

    public void execute(String httpAddress, String email, String password) throws IOException {

        try{


        }
//        JSONObject jsonobj = new JSONObject();
//        jsonobj.put("email", email);
//        //jsonobj.put("old_passw", "306");
//        jsonobj.put("pne_status", 1);
//        jsonobj.put("fcm_id", FirebaseInstanceId.getInstance().getToken());
//            DefaultHttpClient httpclient = new DefaultHttpClient();
//            HttpPost httppostreq = new HttpPost(httpAddress);
//            StringEntity stringPost = new StringEntity(jsonobj.toString());
//            stringPost.setContentType("application/json;charset=UTF-8");
//            stringPost.setContentEncoding(new BasicHeader(HTTP.CONTENT_TYPE,"application/json;charset=UTF-8"));
//            httppostreq.setEntity(stringPost);
//            HttpResponse httpresponse = httpclient.execute(httppostreq);
//
//        }
        catch (Exception e){
            e.printStackTrace();
        }
//        finally {
//            if(client != null) // Make sure the connection is not null.
//                client.disconnect();
//        }
    }


    @Override
    protected String doInBackground(String... params) {
        return null;
    }
}