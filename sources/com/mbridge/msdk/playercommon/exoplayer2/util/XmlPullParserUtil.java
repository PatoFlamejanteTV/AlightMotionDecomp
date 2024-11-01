package com.mbridge.msdk.playercommon.exoplayer2.util;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes4.dex */
public final class XmlPullParserUtil {
    private XmlPullParserUtil() {
    }

    public static String getAttributeValue(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i8 = 0; i8 < attributeCount; i8++) {
            if (xmlPullParser.getAttributeName(i8).equals(str)) {
                return xmlPullParser.getAttributeValue(i8);
            }
        }
        return null;
    }

    public static String getAttributeValueIgnorePrefix(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i8 = 0; i8 < attributeCount; i8++) {
            if (stripPrefix(xmlPullParser.getAttributeName(i8)).equals(str)) {
                return xmlPullParser.getAttributeValue(i8);
            }
        }
        return null;
    }

    public static boolean isEndTag(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return isEndTag(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static boolean isStartTag(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return isStartTag(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static boolean isStartTagIgnorePrefix(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        if (isStartTag(xmlPullParser) && stripPrefix(xmlPullParser.getName()).equals(str)) {
            return true;
        }
        return false;
    }

    private static String stripPrefix(String str) {
        int indexOf = str.indexOf(58);
        if (indexOf != -1) {
            return str.substring(indexOf + 1);
        }
        return str;
    }

    public static boolean isEndTag(XmlPullParser xmlPullParser) throws XmlPullParserException {
        return xmlPullParser.getEventType() == 3;
    }

    public static boolean isStartTag(XmlPullParser xmlPullParser) throws XmlPullParserException {
        return xmlPullParser.getEventType() == 2;
    }
}
