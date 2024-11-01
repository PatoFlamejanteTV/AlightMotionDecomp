package com.mbridge.msdk.playercommon.exoplayer2.extractor.mkv;

import com.mbridge.msdk.playercommon.exoplayer2.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput;
import java.io.IOException;

/* loaded from: classes4.dex */
interface EbmlReaderOutput {
    public static final int TYPE_BINARY = 4;
    public static final int TYPE_FLOAT = 5;
    public static final int TYPE_MASTER = 1;
    public static final int TYPE_STRING = 3;
    public static final int TYPE_UNKNOWN = 0;
    public static final int TYPE_UNSIGNED_INT = 2;

    /* loaded from: classes4.dex */
    public @interface ElementType {
    }

    void binaryElement(int i8, int i9, ExtractorInput extractorInput) throws IOException, InterruptedException;

    void endMasterElement(int i8) throws ParserException;

    void floatElement(int i8, double d8) throws ParserException;

    int getElementType(int i8);

    void integerElement(int i8, long j8) throws ParserException;

    boolean isLevel1Element(int i8);

    void startMasterElement(int i8, long j8, long j9) throws ParserException;

    void stringElement(int i8, String str) throws ParserException;
}
