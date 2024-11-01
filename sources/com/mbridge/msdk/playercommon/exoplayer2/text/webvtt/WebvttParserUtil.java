package com.mbridge.msdk.playercommon.exoplayer2.text.webvtt;

import com.mbridge.msdk.playercommon.exoplayer2.text.SubtitleDecoderException;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class WebvttParserUtil {
    private static final Pattern COMMENT = Pattern.compile("^NOTE(( |\t).*)?$");
    private static final Pattern HEADER = Pattern.compile("^\ufeff?WEBVTT(( |\t).*)?$");

    private WebvttParserUtil() {
    }

    public static Matcher findNextCueHeader(ParsableByteArray parsableByteArray) {
        String readLine;
        while (true) {
            String readLine2 = parsableByteArray.readLine();
            if (readLine2 != null) {
                if (COMMENT.matcher(readLine2).matches()) {
                    do {
                        readLine = parsableByteArray.readLine();
                        if (readLine != null) {
                        }
                    } while (!readLine.isEmpty());
                } else {
                    Matcher matcher = WebvttCueParser.CUE_HEADER_PATTERN.matcher(readLine2);
                    if (matcher.matches()) {
                        return matcher;
                    }
                }
            } else {
                return null;
            }
        }
    }

    public static float parsePercentage(String str) throws NumberFormatException {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long parseTimestampUs(String str) throws NumberFormatException {
        String[] splitAtFirst = Util.splitAtFirst(str, "\\.");
        long j8 = 0;
        for (String str2 : Util.split(splitAtFirst[0], ":")) {
            j8 = (j8 * 60) + Long.parseLong(str2);
        }
        long j9 = j8 * 1000;
        if (splitAtFirst.length == 2) {
            j9 += Long.parseLong(splitAtFirst[1]);
        }
        return j9 * 1000;
    }

    public static void validateWebvttHeaderLine(ParsableByteArray parsableByteArray) throws SubtitleDecoderException {
        String readLine = parsableByteArray.readLine();
        if (readLine != null && HEADER.matcher(readLine).matches()) {
            return;
        }
        throw new SubtitleDecoderException("Expected WEBVTT. Got " + readLine);
    }
}
