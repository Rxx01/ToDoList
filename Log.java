import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

//ToDoList的功能类
public class Log implements Serializable {
	private String userName;    //用户名
	private String password;    //密码
	private ArrayList<Event> events;    //事件集合
	
	//构造函数用于客户登录
	public Log(String userName,String password){
		this.userName = userName;
		this.password = password;
		events = new ArrayList<>();
	}
	//添加待办事件
	public void addEvent(){
	}
	//删除待办事件
	public void delEvent(){
	}
	//改变待办事件状态
	public void chanStatus(){
	}
	//展示待办事件列表
	public void showEvents(){
		System.out.println("您的待办事项如下：");
		Iterator<Event> ite = events.iterator();
		int x = 0;
		while(ite.hasNext()){
			System.out.print(++x + ".");
			ite.next().showEvent();
		}
	}
	//返回事件数量用于添加事件序号
	public int countEvents(){
		return events.size();
	}
	
	public String getUserName() {
		return userName;
	}
	
	public String getPassword() {
		return password;
	}
}
