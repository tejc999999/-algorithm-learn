package jp.spring.boot.algolearn.bean;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import jp.spring.boot.algolearn.bean.embedded.TaskValiableAnswerId;
import lombok.Data;

@Data
@Entity
@Table(name="t_task_valiable_answer")
public class TaskValiableAnswerBean {

	@EmbeddedId
	TaskValiableAnswerId taskValiableAnswerId;
	
	@Column(name="parametor")
	String parametor;
	
	@Column(name="public_flg")
	boolean publicFlg;
	
	@ManyToOne
    @JoinColumn(name = "task_id", referencedColumnName = "id", insertable = false, updatable = false)
//    @MapsId("taskId")
	TaskBean taskBean;

}
