package enumerate;

public enum MsgStatus {
	SENT("Single tick"),
	DELIVERED("Double tick"),
	READ("	Blue double tick"),
	DELETED("This msg is deleted");
	
	String des;
	
	private MsgStatus(String m) {
		des=m;
	}
	public String getMsg()
	{
		return des;
	}

}
