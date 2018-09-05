package com.airron.service;

import java.io.File;
import java.util.List;

public interface FileService {
	List<File> FileMerge(String targetname,List<File> file);
}
