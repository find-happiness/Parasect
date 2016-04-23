// Let's call this example.thrift

namespace java com.foo.thrift

service SerOne {
  /**
   * 用户登录， 返回登录信息 json 格式 [ 含登录结果， APP 的最新版本信息等 ]
   */
  string login (
    /** 用户名 */
    1: string nickname; 
    /** 用户密码 MD5 */
    2: string password;
  );
  
  /**
   * 用户退出
   */
  string logout (
    /** 会话信息 */
    1: string userSession;
  )
}

/**
 * 查询条件
 */
struct Query {
  /** 查询关键字 */
  1: required string text;
  /** 查询起点时间 */
  2: optional i64 resultsNewerThan;
}

/**
 * 查询结果
 */
struct SearchResult {
  /** url */
  1: required string url;
  /** A list of keywords related to the result */
  2: required list<string> keywords = [];
  /** The time at which the result was last checked, in unix millis */
  3: required i64 lastUpdatedMillis;
}

service SerTwo {
  /** 请求查询 */
  list<SearchResult> search(
    /** 查询条件 */
    1: Query query;
  );
}
