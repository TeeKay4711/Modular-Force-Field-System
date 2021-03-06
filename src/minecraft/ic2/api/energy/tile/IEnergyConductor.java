package ic2.api.energy.tile;

public abstract interface IEnergyConductor extends IEnergyAcceptor, IEnergyEmitter
{
  public abstract double getConductionLoss();

  public abstract int getInsulationEnergyAbsorption();

  public abstract int getInsulationBreakdownEnergy();

  public abstract int getConductorBreakdownEnergy();

  public abstract void removeInsulation();

  public abstract void removeConductor();
}