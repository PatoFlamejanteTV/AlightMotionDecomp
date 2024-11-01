package androidx.work.impl.model;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;

@Dao
/* loaded from: classes3.dex */
public interface WorkTagDao {

    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static void insertTags(WorkTagDao workTagDao, String id, Set<String> tags) {
            AbstractC3292y.i(id, "id");
            AbstractC3292y.i(tags, "tags");
            c.a(workTagDao, id, tags);
        }
    }

    @Query("DELETE FROM worktag WHERE work_spec_id=:id")
    void deleteByWorkSpecId(String str);

    @Query("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=:id")
    List<String> getTagsForWorkSpecId(String str);

    @Query("SELECT work_spec_id FROM worktag WHERE tag=:tag")
    List<String> getWorkSpecIdsWithTag(String str);

    @Insert(onConflict = 5)
    void insert(WorkTag workTag);

    void insertTags(String str, Set<String> set);
}
