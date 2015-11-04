/**
 */
package experimentOntology.operation.util;

import experimentOntology.operation.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see experimentOntology.operation.OperationPackage
 * @generated
 */
public class OperationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OperationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationSwitch() {
		if (modelPackage == null) {
			modelPackage = OperationPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case OperationPackage.EXECUTION_PLAN: {
				ExecutionPlan executionPlan = (ExecutionPlan)theEObject;
				T result = caseExecutionPlan(executionPlan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationPackage.COMMON_EXECUTION_PLAN: {
				CommonExecutionPlan commonExecutionPlan = (CommonExecutionPlan)theEObject;
				T result = caseCommonExecutionPlan(commonExecutionPlan);
				if (result == null) result = caseExecutionPlan(commonExecutionPlan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationPackage.INDEPENDENT_EXECUTION_PLAN: {
				IndependentExecutionPlan independentExecutionPlan = (IndependentExecutionPlan)theEObject;
				T result = caseIndependentExecutionPlan(independentExecutionPlan);
				if (result == null) result = caseExecutionPlan(independentExecutionPlan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationPackage.EXECUTION_PLAN_BY_TREATMENT: {
				ExecutionPlanByTreatment executionPlanByTreatment = (ExecutionPlanByTreatment)theEObject;
				T result = caseExecutionPlanByTreatment(executionPlanByTreatment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationPackage.PRE_EXECUTION_PLAN: {
				PreExecutionPlan preExecutionPlan = (PreExecutionPlan)theEObject;
				T result = casePreExecutionPlan(preExecutionPlan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationPackage.PRE_TASKS: {
				PreTasks preTasks = (PreTasks)theEObject;
				T result = casePreTasks(preTasks);
				if (result == null) result = caseContextRelatedTask(preTasks);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationPackage.EXPERIMENTAL_TASKS: {
				ExperimentalTasks experimentalTasks = (ExperimentalTasks)theEObject;
				T result = caseExperimentalTasks(experimentalTasks);
				if (result == null) result = caseContextRelatedTask(experimentalTasks);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationPackage.CONTEXT: {
				Context context = (Context)theEObject;
				T result = caseContext(context);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationPackage.EXECUTION_PLAN_DESCRIPTION: {
				ExecutionPlanDescription executionPlanDescription = (ExecutionPlanDescription)theEObject;
				T result = caseExecutionPlanDescription(executionPlanDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OperationPackage.CONTEXT_RELATED_TASK: {
				ContextRelatedTask contextRelatedTask = (ContextRelatedTask)theEObject;
				T result = caseContextRelatedTask(contextRelatedTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Plan</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Plan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionPlan(ExecutionPlan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Common Execution Plan</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Common Execution Plan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommonExecutionPlan(CommonExecutionPlan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Independent Execution Plan</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Independent Execution Plan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndependentExecutionPlan(IndependentExecutionPlan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Plan By Treatment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Plan By Treatment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionPlanByTreatment(ExecutionPlanByTreatment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pre Execution Plan</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pre Execution Plan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreExecutionPlan(PreExecutionPlan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pre Tasks</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pre Tasks</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreTasks(PreTasks object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Experimental Tasks</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Experimental Tasks</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExperimentalTasks(ExperimentalTasks object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContext(Context object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Plan Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Plan Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionPlanDescription(ExecutionPlanDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Related Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Related Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextRelatedTask(ContextRelatedTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //OperationSwitch
