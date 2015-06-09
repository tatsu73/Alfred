package tatsu73.alfred;

import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;

public class AlfMainActivity extends ActionBarActivity {
	AlertDialog.Builder alertDialog;
	StateSet ss;
	public static final int PREFERENCE_INIT = 0;
	public static final int PREFERENCE_BOOTED = 1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		android.app.ActionBar actionBar = getActionBar();
		actionBar.hide();
	}

	@Override
	protected void onResume(){
		super.onResume();
		alertDialog = new AlertDialog.Builder(this);
		 
	    // �_�C�A���O�̐ݒ�
	    alertDialog.setTitle("FirstBoot");          //�^�C�g��
	    alertDialog.setMessage("���񃁃b�Z�[�W");      //���e
	    alertDialog.setIcon(R.drawable.ic_launcher);   //�A�C�R���ݒ�
	 
	    alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
	 
	        public void onClick(DialogInterface dialog, int which) {
	            //����\������
	            ss.setState(PREFERENCE_BOOTED);
	        }
	    });
	 
	    // �_�C�A���O�̍쐬�ƕ\��
	    if(PREFERENCE_INIT == ss.getState() ){
	        //����N�����̂ݕ\������
	        alertDialog.create();
	        alertDialog.show();
	    }
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.alf_main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	
}
