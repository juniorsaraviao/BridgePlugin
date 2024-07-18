export interface BridgeNativePlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
