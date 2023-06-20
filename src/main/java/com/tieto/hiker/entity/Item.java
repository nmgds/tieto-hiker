package com.tieto.hiker.entity;

import com.tieto.hiker.constant.ItemType;
import com.tieto.hiker.constant.Season;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private String name;

	@Column
	@Enumerated(EnumType.STRING)
	private ItemType type;

	@Column
	private Integer weight;

	@Column
	@Enumerated(EnumType.STRING)
	private Season season;

	@Column
	private Integer requiredPerDay;

}

