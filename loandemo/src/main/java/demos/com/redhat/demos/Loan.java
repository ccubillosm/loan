package demos.com.redhat.demos;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Loan implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "Amount")
   private int amount;
   @org.kie.api.definition.type.Label(value = "Approved")
   private boolean approved;
   @org.kie.api.definition.type.Label(value = "Duration")
   private int duration;
   @org.kie.api.definition.type.Label(value = "InterestRate")
   private double interestRate;

   public Loan()
   {
   }

   public int getAmount()
   {
      return this.amount;
   }

   public void setAmount(int amount)
   {
      this.amount = amount;
   }

   public boolean isApproved()
   {
      return this.approved;
   }

   public void setApproved(boolean approved)
   {
      this.approved = approved;
   }

   public int getDuration()
   {
      return this.duration;
   }

   public void setDuration(int duration)
   {
      this.duration = duration;
   }

   public double getInterestRate()
   {
      return this.interestRate;
   }

   public void setInterestRate(double interestRate)
   {
      this.interestRate = interestRate;
   }

   public Loan(int amount, boolean approved, int duration, double interestRate)
   {
      this.amount = amount;
      this.approved = approved;
      this.duration = duration;
      this.interestRate = interestRate;
   }

}