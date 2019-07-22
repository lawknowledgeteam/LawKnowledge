package com.liyang.entity.relations;

import com.liyang.entity.node.IssueUnit;
import com.liyang.entity.node.Law;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;
import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;

/**
 * @Author: Pan
 * @Date: 2019/7/22 9:09
 * @Description:
 **/
@Getter
@Setter
@NoArgsConstructor
@RelationshipEntity(type = "PublishLaw")
public class PublishLaw {
    @Id
    @GeneratedValue
    private Long id;

    @StartNode
    private IssueUnit issueUnit;

    @EndNode
    private Law law;

    @Property(name = "type")
    private String type;
}
