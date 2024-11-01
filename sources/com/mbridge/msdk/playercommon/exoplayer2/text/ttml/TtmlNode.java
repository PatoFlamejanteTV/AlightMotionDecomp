package com.mbridge.msdk.playercommon.exoplayer2.text.ttml;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.Cue;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes4.dex */
final class TtmlNode {
    public static final String ANONYMOUS_REGION_ID = "";
    public static final String ATTR_ID = "id";
    public static final String ATTR_TTS_BACKGROUND_COLOR = "backgroundColor";
    public static final String ATTR_TTS_COLOR = "color";
    public static final String ATTR_TTS_DISPLAY_ALIGN = "displayAlign";
    public static final String ATTR_TTS_EXTENT = "extent";
    public static final String ATTR_TTS_FONT_FAMILY = "fontFamily";
    public static final String ATTR_TTS_FONT_SIZE = "fontSize";
    public static final String ATTR_TTS_FONT_STYLE = "fontStyle";
    public static final String ATTR_TTS_FONT_WEIGHT = "fontWeight";
    public static final String ATTR_TTS_ORIGIN = "origin";
    public static final String ATTR_TTS_TEXT_ALIGN = "textAlign";
    public static final String ATTR_TTS_TEXT_DECORATION = "textDecoration";
    public static final String BOLD = "bold";
    public static final String CENTER = "center";
    public static final String END = "end";
    public static final String ITALIC = "italic";
    public static final String LEFT = "left";
    public static final String LINETHROUGH = "linethrough";
    public static final String NO_LINETHROUGH = "nolinethrough";
    public static final String NO_UNDERLINE = "nounderline";
    public static final String RIGHT = "right";
    public static final String START = "start";
    public static final String TAG_BODY = "body";
    public static final String TAG_BR = "br";
    public static final String TAG_DIV = "div";
    public static final String TAG_HEAD = "head";
    public static final String TAG_LAYOUT = "layout";
    public static final String TAG_METADATA = "metadata";
    public static final String TAG_P = "p";
    public static final String TAG_REGION = "region";
    public static final String TAG_SMPTE_DATA = "smpte:data";
    public static final String TAG_SMPTE_IMAGE = "smpte:image";
    public static final String TAG_SMPTE_INFORMATION = "smpte:information";
    public static final String TAG_SPAN = "span";
    public static final String TAG_STYLE = "style";
    public static final String TAG_STYLING = "styling";
    public static final String TAG_TT = "tt";
    public static final String UNDERLINE = "underline";
    private List<TtmlNode> children;
    public final long endTimeUs;
    public final boolean isTextNode;
    private final HashMap<String, Integer> nodeEndsByRegion;
    private final HashMap<String, Integer> nodeStartsByRegion;
    public final String regionId;
    public final long startTimeUs;
    public final TtmlStyle style;
    private final String[] styleIds;
    public final String tag;
    public final String text;

    private TtmlNode(String str, String str2, long j8, long j9, TtmlStyle ttmlStyle, String[] strArr, String str3) {
        boolean z8;
        this.tag = str;
        this.text = str2;
        this.style = ttmlStyle;
        this.styleIds = strArr;
        if (str2 != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.isTextNode = z8;
        this.startTimeUs = j8;
        this.endTimeUs = j9;
        this.regionId = (String) Assertions.checkNotNull(str3);
        this.nodeStartsByRegion = new HashMap<>();
        this.nodeEndsByRegion = new HashMap<>();
    }

    private void applyStyleToOutput(Map<String, TtmlStyle> map, SpannableStringBuilder spannableStringBuilder, int i8, int i9) {
        TtmlStyle resolveStyle = TtmlRenderUtil.resolveStyle(this.style, this.styleIds, map);
        if (resolveStyle != null) {
            TtmlRenderUtil.applyStylesToSpan(spannableStringBuilder, i8, i9, resolveStyle);
        }
    }

    public static TtmlNode buildNode(String str, long j8, long j9, TtmlStyle ttmlStyle, String[] strArr, String str2) {
        return new TtmlNode(str, null, j8, j9, ttmlStyle, strArr, str2);
    }

    public static TtmlNode buildTextNode(String str) {
        return new TtmlNode(null, TtmlRenderUtil.applyTextElementSpacePolicy(str), C.TIME_UNSET, C.TIME_UNSET, null, null, "");
    }

    private SpannableStringBuilder cleanUpText(SpannableStringBuilder spannableStringBuilder) {
        int i8;
        int i9;
        int length = spannableStringBuilder.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (spannableStringBuilder.charAt(i11) == ' ') {
                int i12 = i11 + 1;
                int i13 = i12;
                while (i13 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i13) == ' ') {
                    i13++;
                }
                int i14 = i13 - i12;
                if (i14 > 0) {
                    spannableStringBuilder.delete(i11, i11 + i14);
                    length -= i14;
                }
            }
        }
        if (length > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
            length--;
        }
        int i15 = 0;
        while (true) {
            i8 = length - 1;
            if (i15 >= i8) {
                break;
            }
            if (spannableStringBuilder.charAt(i15) == '\n') {
                int i16 = i15 + 1;
                if (spannableStringBuilder.charAt(i16) == ' ') {
                    spannableStringBuilder.delete(i16, i15 + 2);
                    length--;
                }
            }
            i15++;
        }
        if (length > 0 && spannableStringBuilder.charAt(i8) == ' ') {
            spannableStringBuilder.delete(i8, length);
            length--;
        }
        while (true) {
            i9 = length - 1;
            if (i10 >= i9) {
                break;
            }
            if (spannableStringBuilder.charAt(i10) == ' ') {
                int i17 = i10 + 1;
                if (spannableStringBuilder.charAt(i17) == '\n') {
                    spannableStringBuilder.delete(i10, i17);
                    length--;
                }
            }
            i10++;
        }
        if (length > 0 && spannableStringBuilder.charAt(i9) == '\n') {
            spannableStringBuilder.delete(i9, length);
        }
        return spannableStringBuilder;
    }

    private void getEventTimes(TreeSet<Long> treeSet, boolean z8) {
        boolean z9;
        boolean equals = TAG_P.equals(this.tag);
        if (z8 || equals) {
            long j8 = this.startTimeUs;
            if (j8 != C.TIME_UNSET) {
                treeSet.add(Long.valueOf(j8));
            }
            long j9 = this.endTimeUs;
            if (j9 != C.TIME_UNSET) {
                treeSet.add(Long.valueOf(j9));
            }
        }
        if (this.children == null) {
            return;
        }
        for (int i8 = 0; i8 < this.children.size(); i8++) {
            TtmlNode ttmlNode = this.children.get(i8);
            if (!z8 && !equals) {
                z9 = false;
            } else {
                z9 = true;
            }
            ttmlNode.getEventTimes(treeSet, z9);
        }
    }

    private static SpannableStringBuilder getRegionOutput(String str, Map<String, SpannableStringBuilder> map) {
        if (!map.containsKey(str)) {
            map.put(str, new SpannableStringBuilder());
        }
        return map.get(str);
    }

    private void traverseForStyle(long j8, Map<String, TtmlStyle> map, Map<String, SpannableStringBuilder> map2) {
        int i8;
        if (!isActive(j8)) {
            return;
        }
        Iterator<Map.Entry<String, Integer>> it = this.nodeEndsByRegion.entrySet().iterator();
        while (true) {
            i8 = 0;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, Integer> next = it.next();
            String key = next.getKey();
            if (this.nodeStartsByRegion.containsKey(key)) {
                i8 = this.nodeStartsByRegion.get(key).intValue();
            }
            int intValue = next.getValue().intValue();
            if (i8 != intValue) {
                applyStyleToOutput(map, map2.get(key), i8, intValue);
            }
        }
        while (i8 < getChildCount()) {
            getChild(i8).traverseForStyle(j8, map, map2);
            i8++;
        }
    }

    private void traverseForText(long j8, boolean z8, String str, Map<String, SpannableStringBuilder> map) {
        boolean z9;
        this.nodeStartsByRegion.clear();
        this.nodeEndsByRegion.clear();
        if (TAG_METADATA.equals(this.tag)) {
            return;
        }
        if (!"".equals(this.regionId)) {
            str = this.regionId;
        }
        if (this.isTextNode && z8) {
            getRegionOutput(str, map).append((CharSequence) this.text);
            return;
        }
        if (TAG_BR.equals(this.tag) && z8) {
            getRegionOutput(str, map).append('\n');
            return;
        }
        if (isActive(j8)) {
            for (Map.Entry<String, SpannableStringBuilder> entry : map.entrySet()) {
                this.nodeStartsByRegion.put(entry.getKey(), Integer.valueOf(entry.getValue().length()));
            }
            boolean equals = TAG_P.equals(this.tag);
            for (int i8 = 0; i8 < getChildCount(); i8++) {
                TtmlNode child = getChild(i8);
                if (!z8 && !equals) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                child.traverseForText(j8, z9, str, map);
            }
            if (equals) {
                TtmlRenderUtil.endParagraph(getRegionOutput(str, map));
            }
            for (Map.Entry<String, SpannableStringBuilder> entry2 : map.entrySet()) {
                this.nodeEndsByRegion.put(entry2.getKey(), Integer.valueOf(entry2.getValue().length()));
            }
        }
    }

    public final void addChild(TtmlNode ttmlNode) {
        if (this.children == null) {
            this.children = new ArrayList();
        }
        this.children.add(ttmlNode);
    }

    public final TtmlNode getChild(int i8) {
        List<TtmlNode> list = this.children;
        if (list != null) {
            return list.get(i8);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int getChildCount() {
        List<TtmlNode> list = this.children;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final List<Cue> getCues(long j8, Map<String, TtmlStyle> map, Map<String, TtmlRegion> map2) {
        TreeMap treeMap = new TreeMap();
        traverseForText(j8, false, this.regionId, treeMap);
        traverseForStyle(j8, map, treeMap);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : treeMap.entrySet()) {
            TtmlRegion ttmlRegion = map2.get(entry.getKey());
            arrayList.add(new Cue(cleanUpText((SpannableStringBuilder) entry.getValue()), (Layout.Alignment) null, ttmlRegion.line, ttmlRegion.lineType, ttmlRegion.lineAnchor, ttmlRegion.position, Integer.MIN_VALUE, ttmlRegion.width, ttmlRegion.textSizeType, ttmlRegion.textSize));
        }
        return arrayList;
    }

    public final long[] getEventTimesUs() {
        TreeSet<Long> treeSet = new TreeSet<>();
        int i8 = 0;
        getEventTimes(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i8] = it.next().longValue();
            i8++;
        }
        return jArr;
    }

    public final String[] getStyleIds() {
        return this.styleIds;
    }

    public final boolean isActive(long j8) {
        long j9 = this.startTimeUs;
        if ((j9 == C.TIME_UNSET && this.endTimeUs == C.TIME_UNSET) || ((j9 <= j8 && this.endTimeUs == C.TIME_UNSET) || ((j9 == C.TIME_UNSET && j8 < this.endTimeUs) || (j9 <= j8 && j8 < this.endTimeUs)))) {
            return true;
        }
        return false;
    }
}
