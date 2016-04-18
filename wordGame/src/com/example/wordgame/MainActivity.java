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
			textView.setText("你从正门进去之后,看到了一个美女");
			button1.setText("打招呼");
			button2.setText("不理她");
			}
		    if(count==4)
		    {
		    	textView.setText("美女约你去五食堂玩,你去不去");
    			button1.setText("去");
    			button2.setText("不去");
		    }
		    if(count==6)
            {
            	textView.setText("你的钱被抢了");
    			button1.setText("抢回来");
    			button2.setText("算了,自认倒霉");
            }
		    if(count==8)
		    {
		    	textView.setText("路上碰到美女的男朋友,你被打死了");
    			button1.setText("从头开始");
    			button2.setText("不玩了");
		    }
		    if(count==12)
		    {
		    textView.setText("由于抢你钱的是流氓,所以当场被捅死");
			button1.setText("从头开始");
			button2.setText("不玩了");
		    }
		    if(count==18)
		    {
		    	textView.setText("知识大科普,请问ACM组要刷多少题才能进?");
    			button1.setText("80");
    			button2.setText("70");
    			button1.setOnLongClickListener(this);
		    }
		    //脱节需注意
		    if(count==72)
		    {
		    	textView.setText("恭喜您挑战成功,接下来的路上会有更好玩的小游戏哦,你愿意接受挑战么?");
    			button1.setText("愿意");
    			button2.setText("不愿意");
		    }
		    if(count==144)
		    {
		    	Intent intent = new Intent();   
			    intent.setComponent(new ComponentName("com.example.game","com.example.game.MainActivity"));   
			    intent.setAction(Intent.ACTION_VIEW);   
			    startActivity(intent); 
			    try {
					Thread.sleep(3000);
					textView.setText("好玩不老大");
	    			button1.setText("好玩");
	    			button2.setText("不好玩");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			    
		    }
		    if(count==288)
		    {
		    	textView.setText("好玩不老大");
    			button1.setText("好玩");
    			button2.setText("不好玩");
		    }
			break;
			
        case R.id.button2:
            count=2*count+1;
            if(count==3)
            {
        	textView.setText("你从东门进去了发现身上的现金不够,于是你走到了建设银行打算取钱");
			button1.setText("取钱");
			button2.setText("不取钱");
            }
            if(count==5)
		    {
		    	textView.setText("然后那个美女就一直哭一直哭,引来了一群男的,然后你被打死了");
				button1.setText("从头开始");
				button2.setText("不玩了");
		    	//button1.setVisibility(View.INVISIBLE);
		    	//button1.setVisibility(View.INVISIBLE);

		    }
            if(count==7)
            {
            	textView.setText("因为没钱交学费,于是你被开除了");
    			button1.setText("从头开始");
    			button2.setText("不玩了");
    			
            }
            if(count==9)
		    {
		    	textView.setText("你拒绝了美女之后,来到了升旗广场,往左边走是计通楼,往右边走是科技楼");
    			button1.setText("往计通楼方向");
    			button2.setText("往科技楼方向");
		    }
            if(count==13)
            {
            	textView.setText("正担心自己没钱交学费,突然一个美女叫你带他去五食堂那边的计通学院,并且她愿意帮你承担学费,你去不去");
    			button1.setText("去");
    			button2.setText("不去");
            }
            if(count==19)
            {
            	textView.setText("由于科技楼的湖南工业大学四个大字年久失修,当你走到下面的时候,被掉下来的字砸死");
            	button1.setText("这他妈什么烂剧情啊");
    			button2.setText("简直好玩");
            }
            if(count==37)
            {
            	Toast.makeText(this,"回答错误,去问下作者吧QQ598265430",1).show();
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
	    Toast.makeText(this,"真聪明,回答正确",1).show();
		return false;
		
	}
	
}
