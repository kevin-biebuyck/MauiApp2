package crc6452f1ea43b9adf718;

import crc6488302ad6e9e4df1a.MauiAppCompatActivity;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

/* loaded from: classes2.dex */
public class MainActivity extends MauiAppCompatActivity implements IGCUserPeer {
    public static final String __md_methods = "";
    private ArrayList refList;

    static {
        Runtime.register("MauiApp2.MainActivity, MauiApp2", MainActivity.class, "");
    }

    public MainActivity() {
        if (getClass() == MainActivity.class) {
            TypeManager.Activate("MauiApp2.MainActivity, MauiApp2", "", this, new Object[0]);
        }
    }

    public MainActivity(int i) {
        super(i);
        if (getClass() == MainActivity.class) {
            TypeManager.Activate("MauiApp2.MainActivity, MauiApp2", "System.Int32, System.Private.CoreLib", this, new Object[]{Integer.valueOf(i)});
        }
    }

    @Override // crc6488302ad6e9e4df1a.MauiAppCompatActivity, mono.android.IGCUserPeer
    public void monodroidAddReference(Object obj) {
        if (this.refList == null) {
            this.refList = new ArrayList();
        }
        this.refList.add(obj);
    }

    @Override // crc6488302ad6e9e4df1a.MauiAppCompatActivity, mono.android.IGCUserPeer
    public void monodroidClearReferences() {
        ArrayList arrayList = this.refList;
        if (arrayList != null) {
            arrayList.clear();
        }
    }
}