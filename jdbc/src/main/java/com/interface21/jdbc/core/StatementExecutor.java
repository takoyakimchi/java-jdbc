package com.interface21.jdbc.core;

import java.sql.PreparedStatement;

@FunctionalInterface
public interface StatementExecutor<R> {

    R apply(PreparedStatement statement) throws Exception;
}
