package com.example.myapplication.ariqtpaytmsimplifiedcodingapp;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface Api {

    //this is the URL of the paytm folder that we added in the server
    //make sure you are using your ip else it will not work
//    String BASE_URL = "http://192.168.101.1/paytm/";



//    String BASE_URL = "http://10.11.2.122/paytm/";
        String BASE_URL = "http://10.11.2.122/Paytm_Web_Sample_Kit_PHP-master/Paytm_Web_Sample_Kit_PHP-master/PaytmKit/";


//    Test Merchant ID : Simpli91697766727346
//    Test Account Secret Key : 3IK#X5dswQHXnUA@

//    <?php
////Change the value of PAYTM_MERCHANT_KEY constant with details received from Paytm.
//    define('PAYTM_MERCHANT_KEY','3IK#X5dswQHXnUA@');
//?>


//    Technical Suneja:-
//    Test Api Details:-
//    Test Merchant ID : qofSIN69628291597131
//    Test Account Secret Key : BI&B@DfXxG7OWNBd

  //  -------------------------------------------------------------------------------------------------------------

    //    String BASE_URL = "http://192.168.101.1/paytm/";
//    @FormUrlEncoded
//    @POST("generateChecksum.php")
//    Call<Checksum> getChecksum(
//            @Field("MID") String mId,
//            @Field("ORDER_ID") String orderId,
//            @Field("CUST_ID") String custId,
//            @Field("CHANNEL_ID") String channelId,
//            @Field("TXN_AMOUNT") String txnAmount,
//            @Field("WEBSITE") String website,
//            @Field("CALLBACK_URL") String callbackUrl,
//            @Field("INDUSTRY_TYPE_ID") String industryTypeId
//    );

   // ----------------------------------------------------------------------------------------------------------------

    @FormUrlEncoded
    @POST("pgRedirect.php")
//    @POST("pgResponse.php")
    Call<Checksum> getChecksum(
            @Field("MID") String mId,
            @Field("ORDER_ID") String orderId,
            @Field("CUST_ID") String custId,
            @Field("CHANNEL_ID") String channelId,
            @Field("TXN_AMOUNT") String txnAmount,
            @Field("WEBSITE") String website,
            @Field("CALLBACK_URL") String callbackUrl,
            @Field("INDUSTRY_TYPE_ID") String industryTypeId
    );

}
