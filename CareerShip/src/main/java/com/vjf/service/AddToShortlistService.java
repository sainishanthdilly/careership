package com.vjf.service;

import java.util.List;

import com.vjf.car.model.AddToShortListPojo;

public interface AddToShortlistService {

	public List<AddToShortListPojo> processAppliedCandidates(String string);

	public List<AddToShortListPojo> processShortlistCandidates(String string);

	public void shortListACandidate(long parseLong);

}
