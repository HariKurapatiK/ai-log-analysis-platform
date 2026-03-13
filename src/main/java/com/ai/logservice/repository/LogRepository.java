
package com.ai.logservice.repository;

import com.ai.logservice.entity.LogRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogRepository extends JpaRepository<LogRecord,Long> {
}
