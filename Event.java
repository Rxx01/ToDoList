import java.io.Serializable;

//待办事件类
public class Event implements Serializable {
	private String event;   //事件内容
	private boolean status; //事件状态
	private String date;    //事件截止日期
	
	public Event(String event,String date,boolean status) {
		this.event = event;
		this.status = status;
		this.date = date;
	}
	
	public String getEvent() {
		return event;
	}
	
	public void setEvent(String event) {
		this.event = event;
	}
	
	public Boolean getStatus() {
		return status;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	//展示单个待办事件信息
	public void showEvent(){
		System.out.println("Event:" + event);
		System.out.print("  Status: ");
		if(status == false)
			System.out.println("未完成！" + "       Deadline: " + date);
		else{
			System.out.println("已完成！" + "       Deadline: " + date);
		}
	}
}
