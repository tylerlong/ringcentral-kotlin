package com.ringcentral.definitions;


public class CallParty {
    /// <summary>
    /// Internal identifier of a party
    /// </summary>
    public String id;

    /// <summary>
    /// Status data of a call session
    /// </summary>
    public CallStatusInfo status;

    /// <summary>
    /// Specifies if a call participant is muted or not
    /// </summary>
    public Boolean muted;

    /// <summary>
    /// True if party is not connected to a session voice conference. False - otherwise
    /// </summary>
    public Boolean standAlone;

    /// <summary>
    /// Call park information
    /// </summary>
    public ParkInfo park;

    /// <summary>
    /// Data on a calling party
    /// </summary>
    public PartyInfo from;

    /// <summary>
    /// Data on a called party
    /// </summary>
    public PartyInfo to;

    /// <summary>
    /// Data on a call owner
    /// </summary>
    public OwnerInfo owner;

    /// <summary>
    /// Direction of a call
    /// Enum: Inbound, Outbound
    /// </summary>
    public String direction;

    /// <summary>
    /// A party's role in the conference scenarios. For calls of 'Conference' type only
    /// Enum: Host, Participant
    /// </summary>
    public String conferenceRole;

    /// <summary>
    /// A party's role in 'Ring Me'/'RingOut' scenarios. For calls of 'Ringout' type only
    /// Enum: Initiator, Target
    /// </summary>
    public String ringOutRole;

    /// <summary>
    /// A party's role in 'Ring Me'/'RingOut' scenarios. For calls of 'Ringme' type only
    /// Enum: Initiator, Target
    /// </summary>
    public String ringMeRole;

    /// <summary>
    /// Active recordings list
    /// </summary>
    public RecordingInfo[] recordings;
}
