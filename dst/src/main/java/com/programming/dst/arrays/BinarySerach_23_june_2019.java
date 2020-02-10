package com.programming.dst.arrays;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.StringReader;

public class BinarySerach_23_june_2019 {


//    public static void main(String[] args) {
//
//        int searchKey = 6;
//        int[] array = {1, 2, 3, 4, 5, 6, 7};
//        Display.print(array, "Display before rotation : - ");
//
//
//        array = Rotate_22_june_2019.rotate(array, 3);
//        Display.print(array, "Display after rotation : - ");
//        Boolean serachResult = binarySerach(array, searchKey, 0, array.length - 1);
//        System.out.println("\n search for  key is found " + searchKey + "   " + serachResult);
//
//    }


//    public static Boolean binarySerach(int[] array, int key, int low, int high) {
//        if (low > high) return Boolean.FALSE;
//
//        int mid = (low + high) / 2;
//        System.out.println(" mid " + mid + "   - ");
//
//        if (key == array[mid]) return Boolean.TRUE;
//
//        if (key < array[mid])
//            return binarySerach(array, key, 0, mid - 1);
//        else
//            return binarySerach(array, key, mid + 1, high);
//    }





    public static void main(String[] args) {
        Gson gson = new Gson();

                /*new GsonBuilder()
                .setLenient().disableHtmlEscaping()
                .create();
*/                //new Gson();
        // GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();

        String evRequest ="{\"cafNumber\":\"Y019925625\",\"msisdn\":\"7799339910\",\"app\":\"PREPAID\",\"circleName\":\"AP\",\"filePath\":null,\"fileByteArray\":null,\"interactionId\":\"60498b7e-fad0-43d3-8aa8-932c700e37e31576660849069\",\"qrCode\":null,\"scanType\":\"QR\",\"scanMaxThreshold\":10,\"retailerRepush\":null,\"skipPincodeCheck\":false,\"paperFlow\":false,\"faceAuthDone\":false,\"attributes\":{\"GENERAL_INFORMATION\":{\"attributeValue\":\"GENERAL INFORMATION\",\"attributeType\":\"LABEL\",\"editable\":false,\"isEdited\":null,\"attributeScore\":null,\"attributeThreshold\":null,\"dataType\":null,\"required\":false,\"pattern\":null,\"cssClassList\":[\"grey\"]},\"MSISDN\":{\"attributeValue\":\"7799339910\",\"attributeType\":\"FIELD\",\"editable\":false,\"isEdited\":null,\"attributeScore\":null,\"attributeThreshold\":null,\"dataType\":\"\",\"required\":false,\"pattern\":null,\"cssClassList\":[\"grey\"]},\"CIRCLE NAME\":{\"attributeValue\":\"AP\",\"attributeType\":\"FIELD\",\"editable\":false,\"isEdited\":null,\"attributeScore\":null,\"attributeThreshold\":null,\"dataType\":\"\",\"required\":false,\"pattern\":null,\"cssClassList\":[\"grey\"]},\"CUSTOMER TYPE\":{\"attributeValue\":\"Local\",\"attributeType\":\"FIELD\",\"editable\":false,\"isEdited\":null,\"attributeScore\":null,\"attributeThreshold\":null,\"dataType\":\"\",\"required\":false,\"pattern\":null,\"cssClassList\":[\"grey\"]},\"CAF GENERATION DATE\":{\"attributeValue\":\"18-Dec-2019 14:54:42\",\"attributeType\":\"FIELD\",\"editable\":false,\"isEdited\":null,\"attributeScore\":null,\"attributeThreshold\":null,\"dataType\":\"DATE\",\"required\":false,\"pattern\":null,\"cssClassList\":[\"grey\"]},\"POA/POI INFORMATION\":{\"attributeValue\":\"POA/POI INFORMATION\",\"attributeType\":\"LABEL\",\"editable\":false,\"isEdited\":null,\"attributeScore\":null,\"attributeThreshold\":null,\"dataType\":null,\"required\":false,\"pattern\":null,\"cssClassList\":[\"grey\"]},\"POA Type\":{\"attributeValue\":\"UID CARD (ADHAAR CARD)\",\"attributeType\":\"FIELD\",\"editable\":false,\"isEdited\":null,\"attributeScore\":null,\"attributeThreshold\":null,\"dataType\":\"\",\"required\":false,\"pattern\":null,\"cssClassList\":[\"yellow\"]},\"POI Number\":{\"attributeValue\":\"568890270706\",\"attributeType\":\"FIELD\",\"editable\":false,\"isEdited\":null,\"attributeScore\":null,\"attributeThreshold\":null,\"dataType\":\"\",\"required\":true,\"pattern\":null,\"cssClassList\":[\"yellow\"]},\"POI Type\":{\"attributeValue\":\"UID CARD (ADHAAR CARD)\",\"attributeType\":\"FIELD\",\"editable\":false,\"isEdited\":null,\"attributeScore\":null,\"attributeThreshold\":null,\"dataType\":\"\",\"required\":false,\"pattern\":null,\"cssClassList\":[\"grey\"]},\"CUSTOMER INFORMATION\":{\"attributeValue\":\"CUSTOMER INFORMATION\",\"attributeType\":\"LABEL\",\"editable\":false,\"isEdited\":null,\"attributeScore\":null,\"attributeThreshold\":null,\"dataType\":null,\"required\":false,\"pattern\":null,\"cssClassList\":[\"grey\"]},\"DOB\":{\"attributeValue\":\"16-Oct-1997\",\"attributeType\":\"FIELD\",\"editable\":true,\"isEdited\":true,\"attributeScore\":null,\"attributeThreshold\":1,\"dataType\":\"DATE\",\"required\":true,\"pattern\":null,\"cssClassList\":[\"white\"]},\"CUSTOMER NAME\":{\"attributeValue\":\"Mohammed Zaki\",\"attributeType\":\"FIELD\",\"editable\":false,\"isEdited\":false,\"attributeScore\":null,\"attributeThreshold\":1,\"dataType\":\"\",\"required\":true,\"pattern\":\"^[a-zA-Z ]*$\",\"cssClassList\":[\"green\"]},\"Permanent Landmark\":{\"attributeValue\":\"near govt primary school\",\"attributeType\":\"FIELD\",\"editable\":true,\"isEdited\":null,\"attributeScore\":null,\"attributeThreshold\":null,\"dataType\":\"\",\"required\":false,\"pattern\":\"^[a-zA-Z0-9\\\\-/ .,]*$\",\"cssClassList\":[\"white\"]},\"LOCAL ADDRESS\":{\"attributeValue\":\"19-3-741/A, gazi banda, bahadurpura Charminar, near govt primary school, Hyderabad, Hyderabad, Telangana, 500053, \",\"attributeType\":\"FIELD\",\"editable\":false,\"isEdited\":null,\"attributeScore\":null,\"attributeThreshold\":null,\"dataType\":\"\",\"required\":false,\"pattern\":null,\"cssClassList\":[\"yellow\"]},\"MNP INFORMATION\":{\"attributeValue\":\"MNP INFORMATION\",\"attributeType\":\"LABEL\",\"editable\":false,\"isEdited\":null,\"attributeScore\":null,\"attributeThreshold\":null,\"dataType\":null,\"required\":false,\"pattern\":null,\"cssClassList\":[\"grey\"]},\"UPC Code\":{\"attributeValue\":\"VA271273\",\"attributeType\":\"FIELD\",\"editable\":false,\"isEdited\":null,\"attributeScore\":null,\"attributeThreshold\":null,\"dataType\":\"\",\"required\":false,\"pattern\":null,\"cssClassList\":[\"grey\"]},\"Existing Product\":{\"attributeValue\":\"Prepaid\",\"attributeType\":\"FIELD\",\"editable\":false,\"isEdited\":null,\"attributeScore\":null,\"attributeThreshold\":null,\"dataType\":\"\",\"required\":false,\"pattern\":null,\"cssClassList\":[\"grey\"]},\"OTHER INFORMATION\":{\"attributeValue\":\"OTHER INFORMATION\",\"attributeType\":\"LABEL\",\"editable\":false,\"isEdited\":null,\"attributeScore\":null,\"attributeThreshold\":null,\"dataType\":null,\"required\":false,\"pattern\":null,\"cssClassList\":[\"grey\"]},\"POS AGENT NAME\":{\"attributeValue\":\"binarif\",\"attributeType\":\"FIELD\",\"editable\":false,\"isEdited\":null,\"attributeScore\":null,\"attributeThreshold\":null,\"dataType\":\"\",\"required\":false,\"pattern\":null,\"cssClassList\":[\"yellow\"]},\"POS NAME\":{\"attributeValue\":\"Ret-Ret-Ret-Ret-Zam Zam Communication\",\"attributeType\":\"FIELD\",\"editable\":false,\"isEdited\":null,\"attributeScore\":null,\"attributeThreshold\":null,\"dataType\":\"\",\"required\":false,\"pattern\":null,\"cssClassList\":[\"yellow\"]},\"POS ADDRESS\":{\"attributeValue\":\"DRNO:18-13-67\\40 CHNADRAYANA GUFA HYDERABAD ,Begumpet ,Hyderabad ,Hyderabad  ,Telangana ,500016\",\"attributeType\":\"FIELD\",\"editable\":false,\"isEdited\":null,\"attributeScore\":null,\"attributeThreshold\":null,\"dataType\":\"\",\"required\":false,\"pattern\":null,\"cssClassList\":[\"yellow\"]}},\"isCustomerNameGreen\":true,\"isFatherNameGreen\":true,\"isAddressGreen\":true,\"isPoaNoGreen\":true,\"isDobGreen\":false,\"isGenderGreen\":true,\"lob\":\"PREPAID\"}";
        JsonReader reader;
        reader = new JsonReader(new StringReader(evRequest));
        reader.setLenient(true);
        String jsonObject = gson.fromJson(evRequest, String.class);
        System.out.println(jsonObject);
    }



}
