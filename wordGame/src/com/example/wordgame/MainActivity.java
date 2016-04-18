package com.example.wordgame;



import android.support.v4.app.Fragment;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Build;

public class MainActivity extends start implements OnClickListener,OnLongClickListener{
    private Button button1;
    private Button button2;
    private TextView textView;
    private int count=1;
    private boolean flag = true;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_main);

		button1 = (Button) findViewById(R.id.button1);
		button2 = (Button) findViewById(R.id.button2);
		textView = (TextView) findViewById(R.id.textView1);
		button1.setOnClickListener(this);
		button2.setOnClickListener(this);

	}
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.button1:
			if(count!=18)
		    count=2*count;
		
		    if(count==2)
		    {
			textView.setText("������Ž�ȥ֮��,������һ����Ů");
			button1.setText("���к�");
			button2.setText("������");
			}
		    if(count==4)
		    {
		    	textView.setText("��ŮԼ��ȥ��ʳ����,��ȥ��ȥ");
    			button1.setText("ȥ");
    			button2.setText("��ȥ");
		    }
		    if(count==6)
            {
            	textView.setText("���Ǯ������");
    			button1.setText("������");
    			button2.setText("����,���ϵ�ù");
            }
		    if(count==8)
		    {
		    	textView.setText("·��������Ů��������,�㱻������");
    			button1.setText("��ͷ��ʼ");
    			button2.setText("������");
		    }
		    if(count==12)
		    {
		    textView.setText("��������Ǯ������å,���Ե�����ͱ��");
			button1.setText("��ͷ��ʼ");
			button2.setText("������");
		    }
		    if(count==18)
		    {
		    	textView.setText("֪ʶ�����,����ACM��Ҫˢ��������ܽ�?");
    			button1.setText("80");
    			button2.setText("70");
    			button1.setOnLongClickListener(this);
		    }
		    //�ѽ���ע��
		    if(count==72)
		    {
		    	textView.setText("��ϲ����ս�ɹ�,��������·�ϻ��и������С��ϷŶ,��Ը�������սô?");
    			button1.setText("Ը��");
    			button2.setText("��Ը��");
		    }
		    if(count==144)
		    {
		    	Intent intent = new Intent();   
			    intent.setComponent(new ComponentName("com.example.game","com.example.game.MainActivity"));   
			    intent.setAction(Intent.ACTION_VIEW);   
			    startActivity(intent); 
			    try {
					Thread.sleep(3000);
					textView.setText("���治�ϴ�");
	    			button1.setText("����");
	    			button2.setText("������");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			    
		    }
		    if(count==288)
		    {
		    	textView.setText("���治�ϴ�");
    			button1.setText("����");
    			button2.setText("������");
		    }
			break;
			
        case R.id.button2:
            count=2*count+1;
            if(count==3)
            {
        	textView.setText("��Ӷ��Ž�ȥ�˷������ϵ��ֽ𲻹�,�������ߵ��˽������д���ȡǮ");
			button1.setText("ȡǮ");
			button2.setText("��ȡǮ");
            }
            if(count==5)
		    {
		    	textView.setText("Ȼ���Ǹ���Ů��һֱ��һֱ��,������һȺ�е�,Ȼ���㱻������");
				button1.setText("��ͷ��ʼ");
				button2.setText("������");
		    	//button1.setVisibility(View.INVISIBLE);
		    	//button1.setVisibility(View.INVISIBLE);

		    }
            if(count==7)
            {
            	textView.setText("��ΪûǮ��ѧ��,�����㱻������");
    			button1.setText("��ͷ��ʼ");
    			button2.setText("������");
    			
            }
            if(count==9)
		    {
		    	textView.setText("��ܾ�����Ů֮��,����������㳡,��������Ǽ�ͨ¥,���ұ����ǿƼ�¥");
    			button1.setText("����ͨ¥����");
    			button2.setText("���Ƽ�¥����");
		    }
            if(count==13)
            {
            	textView.setText("�������Լ�ûǮ��ѧ��,ͻȻһ����Ů�������ȥ��ʳ���Ǳߵļ�ͨѧԺ,������Ը�����е�ѧ��,��ȥ��ȥ");
    			button1.setText("ȥ");
    			button2.setText("��ȥ");
            }
            if(count==19)
            {
            	textView.setText("���ڿƼ�¥�ĺ��Ϲ�ҵ��ѧ�ĸ��������ʧ��,�����ߵ������ʱ��,����������������");
            	button1.setText("������ʲô�þ��鰡");
    			button2.setText("��ֱ����");
            }
            if(count==37)
            {
            	Toast.makeText(this,"�ش����,ȥ�������߰�QQ598265430",1).show();
            	count=18;
            }
			break;
		default:
			break;
		}
	}
	@Override
	public boolean onLongClick(View v) {
		/*Intent it = new Intent();
		it.setAction("com.ldfs.wz"); 
		startActivity(it);*/
		
		button1.setText("90");
		if(flag==true)
		{
	    count=2*count;
	    flag = false;
		}
	    Toast.makeText(this,"�����,�ش���ȷ",1).show();
		return false;
		
	}
	
}
