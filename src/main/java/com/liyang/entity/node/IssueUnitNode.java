package com.liyang.entity.node;

import com.liyang.entity.ObjectNodeRelation;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;

/**
 * @Author: Pan
 * @Date: 2019/7/21 20:09
 * @Description:
 **/
@Getter
@Setter
@NoArgsConstructor
@NodeEntity(label = "IssueUnit")
public class IssueUnitNode extends ObjectNodeRelation {
/*    @Id
    @GeneratedValue
    private Long id;*/

    @Property(name = "name")
    private String name;

}
