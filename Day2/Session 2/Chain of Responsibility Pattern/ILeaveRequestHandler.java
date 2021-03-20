package chainofResponsibility;

public interface ILeaveRequestHandler {
	public void HandleRequest(LeaveRequest request);
	public void nextHandler(ILeaveRequestHandler nextHandler);
}
