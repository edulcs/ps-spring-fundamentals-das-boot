package com.boot.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Shipwreck {
	Long id;
	String name;
	String description;
	String condition;
	Integer depth;
	Double latitude;
	Double longitude;
	Integer yearDiscovered;
}
