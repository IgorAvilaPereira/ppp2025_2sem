package negocio;

import java.util.ArrayList;
import java.util.List;

public class SQL {
    private String operation;
    private String fields;
    private String table;
    private String where;
    private String orderBy;
    private int limit;
    private int offset;

    // private SQL(String operation, String table, String where, String orderBy, int limit, int offset) {
    //     this.operation = operation;
    //     this.table = table;
    //     this.where = where;
    //     this.orderBy = orderBy;
    //     this.limit = limit;
    //     this.offset = offset;
    // }

    private SQL(Builder builder){
        this.operation = builder.operation;
        this.fields = builder.fields;
        this.table = builder.table;
        this.where = builder.where;
        this.orderBy = builder.orderBy;
        this.limit = builder.limit;
        this.offset = builder.offset;

    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getWhere() {
        return where;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public String toSQL() {
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



     public String getFields() {
         return fields;
     }

     public void setFields(String fields) {
         this.fields = fields;
     }


    @Override
    public String toString() {
        return toSQL();
    }

    
    

     public static class Builder {
           private String operation;
            private String table;
            private String where;
            private String orderBy;
            private int limit;
            private int offset;
            private String fields;

        public Builder operation(String operation) {
            List<String> operationAvailable = new ArrayList<>();
            operationAvailable.add("SELECT");
            operationAvailable.add("DELETE");
            operationAvailable.add("UPDATE");

            if (operationAvailable.contains(operation)) {
                this.operation = operation;
            } else throw new IllegalArgumentException("DEu xabum");
            return this;
        }

        public Builder table(String table) {
            this.table = table;
            return this;
        }

        public Builder where(String where) {
            this.where = where;
            return this;
        }


        public Builder orderBy(String orderBy) {
            this.orderBy = orderBy;
            return this;
        }



        public Builder limit(int limit) {
            this.limit = limit;
            return this;
        }

         public Builder offset(int offset) {
            this.offset = offset;
            return this;
        }
        
        public Builder fields(String fields) {
            this.fields = fields;
            return this;
        }

        public SQL build() {
            return new SQL(this);
        }
    }



    

}
