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
		 
	    // ダイアログの設定
	    alertDialog.setTitle("FirstBoot");          //タイトル
	    alertDialog.setMessage("初回メッセージ");      //内容
	    alertDialog.setIcon(R.drawable.ic_launcher);   //アイコン設定
	 
	    alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
	 
	        public void onClick(DialogInterface dialog, int which) {
	            //初回表示完了
	            ss.setState(PREFERENCE_BOOTED);
	        }
	    });
	 
	    // ダイアログの作成と表示
	    if(PREFERENCE_INIT == ss.getState() ){
	        //初回起動時のみ表示する
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
