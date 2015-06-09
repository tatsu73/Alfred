package tatsu73.alfred;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.widget.TextView;

public class StateSet extends AlfMainActivity{
	
	public static final int PREFERENCE_INIT = 0;
	public static final int PREFERENCE_BOOTED = 1;
	 
	//データ保存
	protected void setState(int state) {
	    // SharedPreferences設定を保存
	    SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
	    sp.edit().putInt("InitState", state).commit();
	 
	}
	 
	//データ読み出し
	protected int getState() {
	    // 読み込み
	    int state;
	    SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
	    state = sp.getInt("InitState", PREFERENCE_INIT);
	 
	    return state;
	}
}
