package com.example;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Map<String,String> map = new HashMap<String,String>();
        map.put("filename","fxukoff中文测试，車");
        map.put("filesize","justalittlebit");
        map.put("operator","dontpissoffrebecca");
        map.put("hash","whothehellareyou?");
        map.put("timestamp","cometofuture");
        map.put("chaincode","whateveryouwantoupload");
        map.put("evidencenumber","bbc1112233523");


        // Map<String,String> map2 = new HashMap();
        // map2.put("img","c:/50336.jpg");

        Map<String,Object> o=new HashMap<String,Object>();
        o.put("datemap",map);
        // o.put("imgmap",map2);
        PdfUtils.pdfout(o, "./my_cert.pdf", "./1.pdf");
    }

    
}
