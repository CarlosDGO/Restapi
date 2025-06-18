package com.CarlosDGO.firstjobapp.job.impl;

import com.CarlosDGO.firstjobapp.job.Job;
import com.CarlosDGO.firstjobapp.job.JobService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobServiceImpl implements JobService {
    private List<Job> jobs = new ArrayList<>();

    @Override
    public List<Job> findAll() {
        return jobs;
    }

    @Override
    public void createJob(Job job) {
        jobs.add(job);

    }
}
