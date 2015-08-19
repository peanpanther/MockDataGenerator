package data.generator.model;

import java.util.UUID;

public class Group {
	private String GroupName;
	private UUID GroupID;

	public String getGroupName() {
		return GroupName;
	}

	public void setGroupName(String groupName) {
		GroupName = groupName;
	}

	public UUID getGroupID() {
		return GroupID;
	}

	public void setGroupID(UUID groupID) {
		GroupID = groupID;
	}

	@Override
	public String toString() {
		return "Group [GroupName=" + GroupName + ", GroupID=" + GroupID + "]";
	}

	public Group(String GroupName, UUID GroupID) {
		this.GroupName = GroupName;
		this.GroupID = GroupID;

	}

}
