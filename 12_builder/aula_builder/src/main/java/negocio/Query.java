package negocio;

import lombok.Builder;

@Builder
public class Query {
    private String operation;
    private String fields;
    private String table;
    private String where;
    private String orderBy;
    private int limit;
    private int offset;

      public String getQuery() {
        StringBuilder sb = new StringBuilder();
        String op = operation == null ? "" : operation.trim();
        String tbl = table == null ? "" : table.trim();
        if (!op.isEmpty()) {
            sb.append(op);
            if (!tbl.isEmpty() && fields == null) {
                sb.append(" * ").append(" FROM ").append(tbl);
            } else if (!tbl.isEmpty() && !fields.isEmpty()) {
                 sb.append("  ").append(fields).append(" ").append(" FROM ").append(tbl);
            }
        } else if (!tbl.isEmpty()) {
            if (fields == null) {
                sb.append("SELECT ").append(" * ").append(" FROM ").append(tbl);
            } else if (!fields.isEmpty()) {
                sb.append("SELECT ").append("  ").append(fields).append(" ").append(" FROM ").append(tbl);
            }
        }

        if (where != null && !where.trim().isEmpty()) {
            sb.append(" WHERE ").append(where.trim());
        }

        if (orderBy != null && !orderBy.trim().isEmpty()) {
            sb.append(" ORDER BY ").append(orderBy.trim());
        }

        if (limit > 0) {
            sb.append(" LIMIT ").append(limit);
        }

        if (offset > 0) {
            sb.append(" OFFSET ").append(offset);
        }

        String sql = sb.toString().trim();
        if (!sql.endsWith(";")) {
            sql += ";";
        }
        return sql;
    }

}
