package net.psm.bean;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class POI {
	String id;
	String name;
	String lat;
	String lng;
	String address;
}