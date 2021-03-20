package chainofResponsibility;

public class Spervisor implements ILeaveRequestHandler {
	ILeaveRequestHandler nextHandler;
	@Override
	public void nextHandler(ILeaveRequestHandler nextHandler) {
		this.nextHandler=nextHandler;
	}
	@Override
	public void HandleRequest(LeaveRequest request) {
	if(request.getLeaveDays()>=1 && request.getLeaveDays()<=3) {
		System.out.println("Leave Granted by Supervisor!");
		System.out.println("Employee Name-"+request.Employee);
		System.out.println("Leave Days-"+request.LeaveDays);
	}
	else {
		nextHandler.HandleRequest(request);
	}

	}

}
