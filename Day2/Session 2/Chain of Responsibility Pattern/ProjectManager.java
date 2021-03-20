package chainofResponsibility;

public class ProjectManager implements ILeaveRequestHandler {
	ILeaveRequestHandler nextHandler;
	@Override
	public void nextHandler(ILeaveRequestHandler nextHandler) {
		this.nextHandler=nextHandler;
	}
	@Override
	public void HandleRequest(LeaveRequest request) {
		if(request.getLeaveDays()>3 && request.getLeaveDays()<=5) {
			System.out.println("Leave Granted By Project Manager!");
			System.out.println("Employee Name-"+request.Employee);
			System.out.println("Leave Days-"+request.LeaveDays);
		}
		else {
			nextHandler.HandleRequest(request);
		}
	}

}
