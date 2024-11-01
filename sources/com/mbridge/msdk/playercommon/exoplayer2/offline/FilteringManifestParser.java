package com.mbridge.msdk.playercommon.exoplayer2.offline;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.offline.FilterableManifest;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.ParsingLoadable;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes4.dex */
public final class FilteringManifestParser<T extends FilterableManifest<T, K>, K> implements ParsingLoadable.Parser<T> {
    private final ParsingLoadable.Parser<T> parser;
    private final List<K> trackKeys;

    public FilteringManifestParser(ParsingLoadable.Parser<T> parser, List<K> list) {
        this.parser = parser;
        this.trackKeys = list;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.ParsingLoadable.Parser
    public final T parse(Uri uri, InputStream inputStream) throws IOException {
        T parse = this.parser.parse(uri, inputStream);
        List<K> list = this.trackKeys;
        return (list == null || list.isEmpty()) ? parse : (T) parse.copy(this.trackKeys);
    }
}
