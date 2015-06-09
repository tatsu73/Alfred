package tatsu73.alfred;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.widget.TextView;

public class StateSet extends AlfMainActivity{
	
	public static final int PREFERENCE_INIT = 0;
	public static final int PREFERENCE_BOOTED = 1;
	 
	//�f�[�^�ۑ�
	protected void setState(int state) {
	    // SharedPreferences�ݒ��ۑ�
	    SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
	    sp.edit().putInt("InitState", state).commit();
	 
	}
	 
	//�f�[�^�ǂݏo��
	protected int getState() {
	    // �ǂݍ���
	    int state;
	    SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
	    state = sp.getInt("InitState", PREFERENCE_INIT);
	 
	    return state;
	}
}
