package rutwik.shende.myretrofitbasicapplication.extras;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;

import rutwik.shende.myretrofitbasicapplication.R;

public class AppPrefference {

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    Context context;

    public AppPrefference(Context context) {
        this.context = context;
        sharedPreferences=context.getSharedPreferences(String.valueOf(R.string.s_pref_file),Context.MODE_PRIVATE);
        editor=sharedPreferences.edit();
    }
    public void setLoginStatus(boolean status)
    {
        editor.putBoolean(String.valueOf(R.string.s_pref_login),status);
        editor.commit();
    }

    public boolean getLoginStatus()
    {
          return sharedPreferences.getBoolean(String.valueOf(R.string.s_pref_login),false);
    }

    public void setDiplayname(String name){

        editor.putString(String.valueOf(R.string.s_pref_login_name),"name");
        editor.commit();
    }

    public void getDiplayname(String name){

        editor.putString(String.valueOf(R.string.s_pref_login_name),"name");

    }

    public void setDiplayemail(String email){

        editor.putString(String.valueOf(R.string.s_pref_login_email),"email");
        editor.commit();
    }

    public void getDiplayemail(String email){

        editor.putString(String.valueOf(R.string.s_pref_login_email),"email");

    }
    public void setDiplayDate(String date){

        editor.putString(String.valueOf(R.string.s_pref_login_created),"date");
        editor.commit();
    }

    public void getDiplaydate(String date){

        editor.putString(String.valueOf(R.string.s_pref_login_created),"date");

    }
    public void  shoeToast(String msg)
    {
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show();
    }

}
