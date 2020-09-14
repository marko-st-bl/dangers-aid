package net.etfbl.ip.marko.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import net.etfbl.ip.marko.dto.Aid;

@ManagedBean
@SessionScoped
public class AidBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4279198337866188433L;
	
	private Aid aid;
	private List<Aid> aids;
	
	public AidBean() {
		super();
		this.aid = new Aid();
		this.aids = new ArrayList<>();
	}

	public Aid getAid() {
		return aid;
	}

	public void setAid(Aid aid) {
		this.aid = aid;
	}

	public List<Aid> getAids() {
		return aids;
	}

	public void setAids(List<Aid> aids) {
		this.aids = aids;
	}

	
}
