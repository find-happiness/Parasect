/**
 * ****************************************************************************
 * Copyright (c) 2015, Uniview Tech, RD IMOS. All rights reserved.
 * --------------------------------------------------------------------------------
 * name: MD5.java
 * <p/>
 * Product: MCD APP
 * Created: 2015-07-09
 * Authors: h01854
 * <p/>
 * Description:
 * <p/>
 * --------------------------------------------------------------------------------
 * ChangeLog
 * DATE        NAME             DESCRIPTION
 * --------------------------------------------------------------------------------
 * 2015-07-09  h01854            initial
 * <p/>
 * *****************************************************************************
 */
package com.domain.parasect.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {

    /**
     * Md5加密 32位加密
     *
     * @param plainText
     * @return
     */
    public static String md5(String plainText) {
        String str = null;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(plainText.getBytes());
            byte b[] = md.digest();

            int i;

            StringBuffer buf = new StringBuffer("");
            for (int offset = 0; offset < b.length; offset++) {
                i = b[offset];
                if (i < 0) {
                    i += 256;
                }
                if (i < 16) {
                    buf.append("0");
                }
                buf.append(Integer.toHexString(i));
            }
            str = buf.toString();
            return str;
        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return str;
    }

    /**
     * 15位加密
     *
     * @param plainText
     * @param isShort
     * @return
     */
    public static String md5(String plainText, boolean isShort) {
        String str = null;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(plainText.getBytes());
            byte b[] = md.digest();

            int i;

            StringBuffer buf = new StringBuffer("");
            for (int offset = 0; offset < b.length; offset++) {
                i = b[offset];
                if (i < 0) {
                    i += 256;
                }
                if (i < 16) {
                    buf.append("0");
                }
                buf.append(Integer.toHexString(i));
            }
            str = buf.toString().substring(8, 24);
            return str;
        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return str;
    }

    /**
     * 判断是否经过MD5加密
     *
     * @param text
     * @return
     */
    public static boolean isMd5(String text) {
        if (null != text && text.length() == 32) {
            return true;
        }

        return false;
    }
}
